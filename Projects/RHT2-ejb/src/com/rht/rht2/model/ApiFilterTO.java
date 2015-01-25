/*
 *
 */
package com.rht.rht2.model;

import com.rht.rht2.enums.ApiFormat.ApiFormats;
import com.rht.rht2.util.StringHelper;

// TODO: Auto-generated Javadoc
/**
 * The Class ApiFilterTO.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ApiFilterTO extends FilterTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2613274054738228467L;

	/** The animal id. */
	private int animalId;

	/** The appointment id. */
	private int appointmentId;

	/** The breed id. */
	private int breedId;

	/** The colour id. */
	private int colourId;

	/** The country id. */
	private int countryId;

	/** The data1. */
	private String data1;

	/** The datasource. */
	private String datasource;

	/** The end dt. */
	private String endDT;

	/** The finger print. */
	private String fingerPrint;

	/** The format. */
	private ApiFormats format;

	/** The gender id. */
	private int genderId;

	/** The global client id. */
	private long globalClientId;

	/** The global key. */
	private String globalKey;

	/** The initial site id. */
	private int initialSiteId;

	/** The key. */
	private String key;

	/** The num name. */
	private String numName;

	/** The password. */
	private String password;

	/** The patient cat id. */
	private int patientCatId;

	/** The period id. */
	private int periodId;

	/** The post code. */
	private String postCode;

	/** The post data. */
	private boolean postData;

	/** The private key. */
	private String privateKey;

	/** The public key. */

	private String publicKey;

	/** The reason id. */
	private int reasonId;

	private int regionId;

	/** The session id. */
	private String sessionId;

	/** The speacies id. */
	private int speaciesId;

	/** The start dt. */
	private String startDT;

	/** The surgeon id. */
	private int surgeonId;

	/** The title id. */
	private int titleId;

	/** The town id. */
	private int townId;

	/** The user id. */
	private long userId;

	/** The vet group id. */
	private int vetGroupId;

	/**
	 * Adds the to sb.
	 *
	 * @param sb
	 *            the sb
	 * @param text
	 *            the text
	 */
	private void addToSB(StringBuilder sb, String text) {
		if (StringHelper.isStringPopulated(text)) {
			sb.append(text);
		}

	}

	/**
	 * Gets the animal id.
	 *
	 *
	
	 * @return the animal id */
	public int getAnimalId() {
		return animalId;
	}

	/**
	 * Gets the appointment id.
	 *
	 *
	
	 * @return the appointment id */
	public int getAppointmentId() {
		return appointmentId;
	}

	/**
	 * Gets the breed id.
	 *
	 *
	
	 * @return the breed id */
	public int getBreedId() {
		return breedId;
	}

	/**
	 * Gets the colour id.
	 *
	 *
	
	 * @return the colour id */
	public int getColourId() {
		return colourId;
	}

	/**
	 * Gets the country id.
	 *
	 *
	
	 * @return the country id */
	public int getCountryId() {
		return countryId;
	}

	/**
	 * Gets the data1.
	 *
	 *
	
	 * @return the data1 */
	public String getData1() {
		return data1;
	}

	/**
	 * Gets the datasource.
	 *
	 *
	
	 * @return the datasource */
	public String getDatasource() {
		return datasource;
	}

	/**
	 * Gets the end dt.
	 *
	 *
	
	 * @return the end dt */
	public String getEndDT() {
		return endDT;
	}

	/**
	 * Gets the finger print.
	 *
	 *
	
	 * @return the finger print */
	public String getFingerPrint() {
		return fingerPrint;
	}

	/**
	 * Gets the format.
	 *
	 *
	
	 * @return the format */
	public ApiFormats getFormat() {
		return format;
	}

	/**
	 * Gets the gender id.
	 *
	 *
	
	 * @return the gender id */
	public int getGenderId() {
		return genderId;
	}

	/**
	 * Gets the global client id.
	 *
	 *
	
	 * @return the global client id */
	public long getGlobalClientId() {
		return globalClientId;
	}

	/**
	 * Gets the global key.
	 *
	 *
	
	 * @return the global key */
	public String getGlobalKey() {
		return globalKey;
	}

	/**
	 * Gets the initial method.
	 *
	 *
	 *
	 *
	 * /** Gets the initial site id.
	 *
	 *
	
	 * @return the initial site id */
	public int getInitialSiteId() {
		return initialSiteId;
	}

	/**
	 * Gets the key.
	 *
	 *
	
	 * @return the key */
	public String getKey() {
		return key;
	}

	/**
	 * Gets the num name.
	 *
	 *
	
	 * @return the num name */
	public String getNumName() {
		return numName;
	}

	/**
	 * Gets the password.
	 *
	 *
	
	 * @return the password */
	public String getPassword() {
		return password;
	}

	/**
	 * Gets the patient cat id.
	 *
	 *
	
	 * @return the patient cat id */
	public int getPatientCatId() {
		return patientCatId;
	}

	/**
	 * Gets the period id.
	 *
	 *
	
	 * @return the period id */
	public int getPeriodId() {
		return periodId;
	}

	/**
	 * Gets the post code.
	 *
	 *
	
	 * @return the post code */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Gets the private key.
	 *
	 *
	
	 * @return the private key */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * Gets the public key.
	 *
	 *
	
	 * @return the public key */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * Gets the reason id.
	 *
	 *
	
	 * @return the reason id */
	public int getReasonId() {
		return reasonId;
	}

	/**
	 * Method getRegionId.
	 *
	
	 * @return int */
	public int getRegionId() {
		return regionId;
	}

	/**
	 * Gets the session id.
	 *
	 *
	
	 * @return the session id */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * Gets the speacies id.
	 *
	 *
	
	 * @return the speacies id */
	public int getSpeaciesId() {
		return speaciesId;
	}

	/**
	 * Gets the start dt.
	 *
	 *
	
	 * @return the start dt */
	public String getStartDT() {
		return startDT;
	}

	/**
	 * Gets the surgeon id.
	 *
	 *
	
	 * @return the surgeon id */
	public int getSurgeonId() {
		return surgeonId;
	}

	/**
	 * Gets the title id.
	 *
	 *
	
	 * @return the title id */
	public int getTitleId() {
		return titleId;
	}

	/**
	 * Gets the town id.
	 *
	 *
	
	 * @return the town id */
	public int getTownId() {
		return townId;
	}

	/**
	 * Gets the user id.
	 *
	 *
	
	 * @return the user id */
	public long getUserId() {
		return userId;
	}

	/**
	 * Gets the vet group id.
	 *
	 *
	
	 * @return the vet group id */
	public int getVetGroupId() {
		return vetGroupId;
	}

	/**
	 * Checks if is post data.
	 *
	 *
	
	 * @return true, if is post data */
	public boolean isPostData() {
		return postData;
	}

	/**
	 * Sets the animal id.
	 *
	 * @param animalId
	 *            the new animal id
	 */
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	/**
	 * Sets the appointment id.
	 *
	 * @param appointmentId
	 *            the new appointment id
	 */
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	/**
	 * Sets the breed id.
	 *
	 * @param breedId
	 *            the new breed id
	 */
	public void setBreedId(int breedId) {
		this.breedId = breedId;
	}

	/**
	 * Sets the colour id.
	 *
	 * @param colourId
	 *            the new colour id
	 */
	public void setColourId(int colourId) {
		this.colourId = colourId;
	}

	/**
	 * Sets the country id.
	 *
	 * @param countryId
	 *            the new country id
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	/**
	 * Sets the data1.
	 *
	 * @param data1
	 *            the new data1
	 */
	public void setData1(String data1) {
		this.data1 = data1;
	}

	/**
	 * Sets the datasource.
	 *
	 * @param datasource
	 *            the new datasource
	 */
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}

	/**
	 * Sets the end dt.
	 *
	 * @param endDT
	 *            the new end dt
	 */
	public void setEndDT(String endDT) {
		this.endDT = endDT;
	}

	/**
	 * Sets the finger print.
	 *
	 * @param fingerPrint
	 *            the new finger print
	 */
	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}

	/**
	 * Sets the format.
	 *
	 * @param format
	 *            the new format
	 */
	public void setFormat(ApiFormats format) {
		this.format = format;
	}

	/**
	 * Sets the gender id.
	 *
	 * @param genderId
	 *            the new gender id
	 */
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	/**
	 * Sets the global client id.
	 *
	 * @param globalClientId
	 *            the new global client id
	 */
	public void setGlobalClientId(long globalClientId) {
		this.globalClientId = globalClientId;
	}

	/**
	 * Sets the global key.
	 *
	 * @param globalKey
	 *            the new global key
	 */
	public void setGlobalKey(String globalKey) {
		this.globalKey = globalKey;
	}

	/**
	 * Sets the initial site id.
	 *
	 * @param initialSiteId
	 *            the new initial site id
	 */
	public void setInitialSiteId(int initialSiteId) {
		this.initialSiteId = initialSiteId;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *            the new key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Sets the num name.
	 *
	 * @param numName
	 *            the new num name
	 */
	public void setNumName(String numName) {
		this.numName = numName;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Sets the patient cat id.
	 *
	 * @param patientCatId
	 *            the new patient cat id
	 */
	public void setPatientCatId(int patientCatId) {
		this.patientCatId = patientCatId;
	}

	/**
	 * Sets the period id.
	 *
	 * @param periodId
	 *            the new period id
	 */
	public void setPeriodId(int periodId) {
		this.periodId = periodId;
	}

	/**
	 * Sets the post code.
	 *
	 * @param postCode
	 *            the new post code
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * Sets the post data.
	 *
	 * @param postData
	 *            the new post data
	 */
	public void setPostData(boolean postData) {
		this.postData = postData;
	}

	/**
	 * Sets the private key.
	 *
	 * @param privateKey
	 *            the new private key
	 */
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	/**
	 * Sets the public key.
	 *
	 * @param publicKey
	 *            the new public key
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	/**
	 * Sets the reason id.
	 *
	 * @param reasonId
	 *            the new reason id
	 */
	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	/**
	 * Method setRegionId.
	 *
	 * @param regionId
	 *            int
	 */
	public void setRegionId(int regionId) {
		this.regionId = regionId;

	}

	/**
	 * Sets the session id.
	 *
	 * @param sessionId
	 *            the new session id
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * Sets the speacies id.
	 *
	 * @param speaciesId
	 *            the new speacies id
	 */
	public void setSpeaciesId(int speaciesId) {
		this.speaciesId = speaciesId;
	}

	/**
	 * Sets the start dt.
	 *
	 * @param startDT
	 *            the new start dt
	 */
	public void setStartDT(String startDT) {
		this.startDT = startDT;
	}

	/**
	 * Sets the surgeon id.
	 *
	 * @param surgeonId
	 *            the new surgeon id
	 */
	public void setSurgeonId(int surgeonId) {
		this.surgeonId = surgeonId;
	}

	/**
	 * Sets the title id.
	 *
	 * @param titleId
	 *            the new title id
	 */
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	/**
	 * Sets the town id.
	 *
	 * @param townId
	 *            the new town id
	 */
	public void setTownId(int townId) {
		this.townId = townId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * Sets the vet group id.
	 *
	 * @param vetGroupId
	 *            the new vet group id
	 */
	public void setVetGroupId(int vetGroupId) {
		this.vetGroupId = vetGroupId;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("");

		if (StringHelper.isStringPopulated(key)) {
			addToSB(sb, key);
		}
		if (StringHelper.isStringPopulated(datasource)) {
			addToSB(sb, datasource);
		}

		addToSB(sb, format.value());

		return sb.toString();
	}

}
