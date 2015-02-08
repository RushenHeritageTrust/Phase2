package com.rht.rht2.web.views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.rht.rht2.entities.Accountstatus;
import com.rht.rht2.web.RHTcontainers;
import com.rht.rht2.web.dialogs.NewAccountStatusWindow;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class MainView extends VerticalLayout implements View {

	final public String SUPER_USER = "super_user";

	private JPAContainer<Accountstatus> accStatusCont;
	private NewAccountStatusWindow newAccountStatusDialog;
	private Table table;
	private Button but;
	private Button but2;
	private Button but3;

	public MainView() {

		this.accStatusCont = RHTcontainers.getInstance()
				.getAccountStatusContainer();
		;

		if (accStatusCont.size() == 0) {
			// generateDummyData();
		}
		newAccountStatusDialog = new NewAccountStatusWindow();
		buildGUI();
		bindListeners();
	}

	private void bindListeners() {

		but2.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				getUI().addWindow(newAccountStatusDialog);
			}
		});

		but3.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				if (table.getValue() != null) {
					accStatusCont.removeItem(table.getValue());
					accStatusCont.commit();
					Notification.show("Remove item");
				}
			}
		});

	}

	private void generateDummyData() {

		accStatusCont.addEntity(new Accountstatus("READ_ONLY"));
		accStatusCont.addEntity(new Accountstatus("CONTRIBUTOR"));
		accStatusCont.addEntity(new Accountstatus("MODERATOR"));
		accStatusCont.addEntity(new Accountstatus("ADMIN"));
		accStatusCont.addEntity(new Accountstatus("SUPER_USER"));
		accStatusCont.commit();

	}

	private Component generateUsersMenu() {
		return null; // TODO
	}

	private Component generateMainMenu() {

		HorizontalSplitPanel hsp = new HorizontalSplitPanel();
		hsp.setSizeFull();

		GridLayout gl = new GridLayout(5, 2);
		gl.setSizeFull();
		gl.setMargin(true);
		hsp.setSecondComponent(gl);
		hsp.setSplitPosition(20f, Unit.PERCENTAGE);

		table = new Table("Account Status") {
			@Override
			protected String formatPropertyValue(Object rowId, Object colId,
					Property<?> property) {
				if (property.getType() != Date.class)
					return super.formatPropertyValue(rowId, colId, property);
				else {
					DateFormat df = new SimpleDateFormat("yyyy");
					return df.format(property.getValue());
				}
			}
		};
		table.setContainerDataSource(accStatusCont);
		table.setSelectable(true);

		table.setVisibleColumns(new String[] { "stauts", "accountStatusId" });
		table.addPropertySetChangeListener(new Container.PropertySetChangeListener() {
			@Override
			public void containerPropertySetChange(
					Container.PropertySetChangeEvent propertySetChangeEvent) {
				refreshFooter();
			}
		});
		refreshFooter();
		table.setSizeFull();

		gl.addComponent(table, 0, 0, 4, 0);

		but = new Button("button");

		but.setWidth("90%");
		gl.addComponent(but, 0, 1);
		gl.setComponentAlignment(but, Alignment.BOTTOM_CENTER);

		but2 = new Button("Add new");
		but2.setWidth("90%");
		gl.addComponent(but2, 1, 1);
		gl.setComponentAlignment(but2, Alignment.BOTTOM_CENTER);

		but3 = new Button("Remove item");

		but3.setWidth("90%");
		gl.addComponent(but3, 2, 1);
		gl.setComponentAlignment(but3, Alignment.BOTTOM_CENTER);

		gl.setRowExpandRatio(0, 6f);
		gl.setRowExpandRatio(1, 1f);

		return hsp;
	}

	private void refreshFooter() {

		// Setting footer
		//
		EntityManager manager = accStatusCont.getEntityProvider()
				.getEntityManager();

		table.setFooterVisible(true);
		//
		// End of footer
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
		Subject user = SecurityUtils.getSubject();

		if (!(user.isAuthenticated() || user.hasRole("normal-user"))) {
			getUI().getNavigator().navigateTo("login");
		}
		setComponentsEnabled(user);

	}

	private void setComponentsEnabled(Subject user) {
		boolean enableExtraEditing = user.hasRole(SUPER_USER);
		but2.setEnabled(enableExtraEditing);
		but3.setEnabled(enableExtraEditing);
		table.setEditable(enableExtraEditing);
	}

	private void buildGUI() {
		setSizeFull();
		this.setMargin(true);

		Button logout = new Button("Logout");
		logout.setStyleName("link");
		logout.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				logout();
			}
		});
		this.addComponent(logout);
		this.setComponentAlignment(logout, Alignment.TOP_RIGHT);

		TabSheet tabs = new TabSheet();
		tabs.addTab(generateMainMenu(), "Main");
		tabs.setSizeFull();
		this.addComponent(tabs);
		setExpandRatio(tabs, 1f);
	}

	private void logout() {
		SecurityUtils.getSubject().logout();
		getUI().getPage().setLocation("/");
	}
}
