package com.rht.rht2.web.base;

import org.apache.shiro.SecurityUtils;

import com.rht.rht2.web.views.LoginView;
import com.rht.rht2.web.views.MainView;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class Base extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@AutoGenerated
	private UI mainLayout;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public Base() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

	}

	@AutoGenerated
	private UI buildMainLayout() {

		VerticalLayout vl = new VerticalLayout();
		mainLayout.setContent(vl);
		vl.setSizeFull();

		Panel mainPanel = new Panel("Sklep by Mati");
		mainPanel.setWidth("80%");
		mainPanel.setHeight("80%");
		vl.addComponent(mainPanel);
		vl.setComponentAlignment(mainPanel, Alignment.MIDDLE_CENTER);

		Navigator navigator = new Navigator(mainLayout, mainPanel);
		navigator.addView("login", new LoginView());
		navigator.addView("main", new MainView());
		if (SecurityUtils.getSubject().isAuthenticated())
			navigator.navigateTo("main");
		else
			navigator.navigateTo("login");

		/*
		 * // common part: create layout mainLayout = new AbsoluteLayout();
		 * mainLayout.setImmediate(false); mainLayout.setWidth("100%");
		 * mainLayout.setHeight("100%");
		 * 
		 * // top-level component properties setWidth("100.0%");
		 * setHeight("100.0%");
		 * 
		 * // verticalSplitPanel_1 verticalSplitPanel_1 =
		 * buildVerticalSplitPanel_1(); mainLayout
		 * .addComponent(verticalSplitPanel_1, "top:20.0px;left:20.0px;");
		 */

		return mainLayout;
	}

}
