/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rht.rht2.api.util.email;

import java.util.Properties;

import javax.mail.Session;

/**
 *
 * @author pwray
 * @version $Revision: 1.0 $
 */
public class EmailServerDetails {
	public static final String MAIL_SMTP_HOST = "mail.smtp.host";
	public static final String MAIL_SMTP_PASSWORD = "mail.smtp.password";
	public static final String MAIL_SMTP_USER = "mail.smtp.user";

	private final String host;
	private final String password;
	private Session session;
	private final String user;

	/**
	 * Constructor for EmailServerDetails.
	 * 
	 * @param host
	 *            String
	 * @param user
	 *            String
	 * @param password
	 *            String
	 */
	public EmailServerDetails(String host, String user, String password) {
		this.host = host;
		this.user = user;
		this.password = password;
	}

	/**
	 * Method checkForMailProperties.
	 * 
	 * @param p
	 *            Properties
	 */
	private void checkForMailProperties(Properties p) {
		if (!p.contains(MAIL_SMTP_HOST)) {
			p.put(MAIL_SMTP_HOST, host);
			System.out.println("set " + MAIL_SMTP_HOST + " to " + host);
			p.put("mail.host", host);
		}

		if (!p.contains(MAIL_SMTP_USER)) {
			p.put(MAIL_SMTP_USER, user);
			p.put("mail.user", user);
		}

		if (!p.contains(MAIL_SMTP_PASSWORD)) {
			p.put(MAIL_SMTP_PASSWORD, password);
			p.put("mail.password", password);
		}
	}

	/**
	 * Method getHost.
	 * 
	 * @return String
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Method getPassword.
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Method getSession.
	 * 
	 * @return Session
	 */
	public Session getSession() {
		if (session == null) {
			final Properties p = System.getProperties();
			checkForMailProperties(p);
			session = Session.getDefaultInstance(p);
		}

		return session;
	}

	/**
	 * Method getUser.
	 * 
	 * @return String
	 */
	public String getUser() {
		return user;
	}

}
