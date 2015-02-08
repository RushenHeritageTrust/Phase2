package com.rht.rht2.web;

import javax.servlet.annotation.WebServlet;

import com.rht.rht2.web.base.Base;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("vaadintest")
@PreserveOnRefresh
@Title("Rushen Heritage Trust")
public class RHT2_webUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = RHT2_webUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		// final VerticalLayout layout = new VerticalLayout();
		// layout.setMargin(true);
		// Label label = new Label("Hello World");
		// layout.addComponent(label);

		initJPAContainers();

		Base base = new Base();
		setContent(base);

	}

	private void initJPAContainers() {
		RHTcontainers.getInstance();
	}

}
