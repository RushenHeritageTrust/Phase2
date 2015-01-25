/*
 *
 */
package com.rht.rht2.util;

// TODO: Auto-generated Javadoc
/**
 * The Class RhtEncryption.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class RhtEncryption {

	/** The Constant DEFAULT_ENCRYPTION. */
	public static final String DEFAULT_ENCRYPTION = "RRRhhhtEncrypt10n";

	/**
	 * Decrypt.
	 *
	 * @param encryptedText
	 *            the encrypted text
	 *
	
	 * @return the string */
	public static final String decrypt(String encryptedText) {
		final Blowfish blowfish = new Blowfish(DEFAULT_ENCRYPTION);
		return blowfish.decryptString(encryptedText);
	}

	/**
	 * Decrypt.
	 *
	 * @param encryptedText
	 *            the encrypted text
	 * @param seed
	 *            the seed
	 *
	
	 * @return the string */
	public static final String decrypt(String encryptedText, String seed) {
		final Blowfish blowfish = new Blowfish(seed);
		return blowfish.decryptString(encryptedText);
	}

	/**
	 * Encrypt.
	 *
	 * @param plainText
	 *            the plain text
	 *
	
	 * @return the string */
	public static final String encrypt(String plainText) {
		final Blowfish blowfish = new Blowfish(DEFAULT_ENCRYPTION);
		return blowfish.encryptString(plainText);
	}

	/**
	 * Encrypt.
	 *
	 * @param plainText
	 *            the plain text
	 * @param seed
	 *            the seed
	 *
	
	 * @return the string */
	public static final String encrypt(String plainText, String seed) {
		final Blowfish blowfish = new Blowfish(seed);
		return blowfish.encryptString(plainText);
	}

}
