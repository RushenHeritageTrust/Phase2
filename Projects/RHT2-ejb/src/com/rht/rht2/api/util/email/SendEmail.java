/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rht.rht2.api.util.email;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.LoggerFactory;

/**
 */
public class SendEmail {

	private InternetAddress from;
	private MimeMessage message;
	private Multipart multipart;
	private final List<InternetAddress> recipients = new ArrayList<InternetAddress>();
	private final EmailServerDetails server;

	/**
	 * Constructor for SendEmail.
	 *
	 * @param server
	 *            EmailServerDetails
	 * @param from
	 *            String
	
	 * @throws EmailException */
	public SendEmail(EmailServerDetails server, String from)
			throws EmailException {
		this.server = server;
		try {
			this.from = new InternetAddress(from);
			message = createMessage();
			message.setFrom(this.from);
		} catch (final AddressException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException(from + " is an Invalid Sender Address.",
					ex);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException("Failed to set who the email is from.", ex);
		}
	}

	/**
	 * Method addRecipient.
	 * @param to String
	 * @throws EmailException
	 */
	public void addRecipient(String to) throws EmailException {
		try {
			final InternetAddress ia = new InternetAddress(to);
			recipients.add(ia);
		} catch (final AddressException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException("Failed to add the recipient " + to, ex);
		}
	}

	/**
	 * Method attachFile.
	 * @param file File
	 * @throws EmailException
	 */
	public void attachFile(File file) throws EmailException {
		if (file == null) {
			return;
		}

		try {
			final MimeBodyPart bodyPart = new MimeBodyPart();
			bodyPart.attachFile(file);
			multipart.addBodyPart(bodyPart);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException("Failed to attach the file "
					+ file.getAbsolutePath(), ex);
		} catch (final IOException ioe) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ioe);
			throw new EmailException("Failed to attach the file "
					+ file.getAbsolutePath(), ioe);
		}
	}

	/**
	 * Method attachFile.
	 * @param filename String
	 * @throws EmailException
	 */
	public void attachFile(String filename) throws EmailException {
		if (filename == null || filename.length() == 0) {
			return;
		}
		try {
			final MimeBodyPart bodyPart = new MimeBodyPart();
			bodyPart.attachFile(filename);
			multipart.addBodyPart(bodyPart);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException("Failed to attach the file " + filename,
					ex);
		} catch (final IOException ioe) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ioe);
			throw new EmailException("Failed to attach the file " + filename,
					ioe);
		}
	}

	/**
	 * Method attachFiles.
	 *
	 * @param files
	 *            ArrayList<File>
	
	 * @throws EmailException */
	public void attachFiles(ArrayList<File> files) throws EmailException {
		if (files == null) {
			return;
		}
		final int fileCount = files.size();
		try {
			MimeBodyPart bodyPart = null;
			File file = null;
			for (int i = 0; i < fileCount; i++) {
				file = files.get(i);
				try {
					bodyPart = new MimeBodyPart();
					final FileDataSource fileDataSource = new FileDataSource(
							file);
					bodyPart.setDataHandler(new DataHandler(fileDataSource));
					bodyPart.setFileName(file.getName());
					multipart.addBodyPart(bodyPart);
				} catch (final MessagingException ex) {
					LoggerFactory.getLogger(SendEmail.class.getName()).debug(
							null, ex);
					throw new EmailException("Failed to attach the file "
							+ file.getAbsolutePath(), ex);
				}
			}

		} catch (final Exception e) {
			throw new EmailException("Failed to attach the file ", e);
		}
	}

	/**
	 * Method createMessage.
	 * @return MimeMessage
	 * @throws EmailException
	 */
	private MimeMessage createMessage() throws EmailException {
		final Session session = server.getSession();
		final MimeMessage mm = new MimeMessage(session);

		/*
		 * if (mm == null) { throw new
		 * EmailException("Failed to create a MimeMessage, Email will not be sent"
		 * , null); }
		 */

		multipart = new MimeMultipart("related");
		try {
			mm.setContent(multipart);
			mm.setSentDate(new Date());
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException(
					"Failed to set Message properties, Email will not be sent",
					ex);
		}

		return mm;
	}

	/**
	 * Method embeddImage.
	 *
	 * @param imagePath
	 *            String
	 * @param embeddedName
	 *            String
	
	 * @throws EmailException */
	public void embeddImage(String imagePath, String embeddedName)
			throws EmailException {
		try {
			final MimeBodyPart bodyPart = new MimeBodyPart();
			final FileDataSource fds = new FileDataSource(imagePath);
			bodyPart.setDataHandler(new DataHandler(fds));
			bodyPart.setHeader("Content-ID", embeddedName);
			multipart.addBodyPart(bodyPart);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException("Failed to embed the image file "
					+ imagePath, ex);
		}
	}

	/**
	 * Method sendEmail.
	 *
	
	 * @throws EmailException */
	public void sendEmail() throws EmailException {
		// System.out.println("sendMail: Host=" + server.getHost() +
		// ", User="+server.getUser()
		// + ", password="+server.getPassword());

		try {
			message.setRecipients(RecipientType.TO,
					recipients.toArray(new InternetAddress[0]));
			Transport.send(message);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException(ex.getMessage(), ex);
		}
	}

	/**
	 * Method setBody.
	 * @param bodyText String
	 * @throws EmailException
	 */
	public void setBody(String bodyText) throws EmailException {
		try {
			final MimeBodyPart bodyPart = new MimeBodyPart();
			bodyPart.setText(bodyText);
			multipart.addBodyPart(bodyPart);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException(
					"Failed to set the content of the email body.", ex);
		}
	}

	/**
	 * Method setHtmlContent.
	 * @param bodyText String
	 * @throws EmailException
	 */
	public void setHtmlContent(String bodyText) throws EmailException {
		try {
			final MimeBodyPart bodyPart = new MimeBodyPart();
			bodyPart.setContent(bodyText, "text/html");
			multipart.addBodyPart(bodyPart);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException(
					"Failed to set the content of the email body.", ex);
		}
	}

	/**
	 * Method setSubject.
	 * @param subject String
	 * @throws EmailException
	 */
	public void setSubject(String subject) throws EmailException {
		try {
			message.setSubject(subject);
		} catch (final MessagingException ex) {
			LoggerFactory.getLogger(SendEmail.class.getName()).debug(null, ex);
			throw new EmailException("Failed to set the email subject.", ex);
		}
	}
}
