package com.rht.rht2.web.dialogs;

import com.rht.rht2.entities.Accountstatus;
import com.rht.rht2.web.RHTcontainers;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class NewAccountStatusWindow extends Window implements
		Window.CloseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BeanItem<Accountstatus> accountStatus;
	private FieldGroup binder;

	public NewAccountStatusWindow() {
		super("New Account Status");
		setModal(true);
		setWidth("50%");
		setHeight("50%");
		addCloseListener(this);

		VerticalLayout vl = new VerticalLayout();
		vl.setSizeFull();
		vl.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		setContent(vl);

		accountStatus = new BeanItem<Accountstatus>(new Accountstatus());

		binder = new FieldGroup(accountStatus);

		FormLayout form = new FormLayout();
		form.setImmediate(true);
		form.setSizeUndefined();

		form.addComponent(binder.buildAndBind("Status", "status"));

		Button accept = new Button("Accept");
		accept.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				try {
					binder.commit();
				} catch (FieldGroup.CommitException e) {
					e.printStackTrace();
				}

				final JPAContainer<Accountstatus> accStatusCont = RHTcontainers
						.getInstance().getAccountStatusContainer();
				accStatusCont.addEntity(accountStatus.getBean());
				accStatusCont.commit();
				accountStatus = new BeanItem<Accountstatus>(new Accountstatus());
				binder.setItemDataSource(accountStatus);
				Notification.show("Saving new Account Status",
						Notification.Type.HUMANIZED_MESSAGE);
				close();
			}
		});

		form.addComponent(accept);

		vl.addComponent(form);

	}

	@Override
	public void windowClose(CloseEvent closeEvent) {
		accountStatus = new BeanItem<Accountstatus>(new Accountstatus());
		binder.setItemDataSource(accountStatus);
	}
}
