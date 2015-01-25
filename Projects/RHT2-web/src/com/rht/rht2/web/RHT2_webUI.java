package com.rht.rht2.web;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;

import com.rht.rht2.web.base.Base;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("vaadintest")
public class RHT2_webUI extends UI {

	@Inject
	Base base;

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = RHT2_webUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		// final VerticalLayout layout = new VerticalLayout();
		// layout.setMargin(true);
		setContent(base);

	}

}
