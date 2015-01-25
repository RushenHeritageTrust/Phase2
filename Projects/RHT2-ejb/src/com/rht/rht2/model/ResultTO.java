/*
 *
 */
package com.rht.rht2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class ResultTO.
 *
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("serial")
public class ResultTO<T> implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6430555166636817175L;

	/** The Constant TYPE_CREATE. */
	public static final int TYPE_CREATE = 4;

	/** The Constant TYPE_DELETE. */
	public static final int TYPE_DELETE = 1;

	/** The Constant TYPE_MOVE. */
	public static final int TYPE_MOVE = 8;

	/** The Constant TYPE_READ. */
	public static final int TYPE_READ = 0;

	/** The Constant TYPE_RESTORE. */
	public static final int TYPE_RESTORE = 16;

	/** The Constant TYPE_UPDATE. */
	public static final int TYPE_UPDATE = 2;

	/** The action type. */
	private int actionType;

	/** The message. */
	private String message;

	/** The message type. */
	private int messageType;

	/** The offset. */
	private int offset;

	/** The props. */
	private Map<String, String> props;

	/** The records. */
	private T[] records;

	/** The search count. */
	private int searchCount;

	/** The success. */
	private boolean success;

	/** The value. */
	private T value;

	/**
	 * Instantiates a new result to.
	 */
	public ResultTO() {
	}

	/**
	 * Instantiates a new result to.
	 *
	 * @param message
	 *            the message
	 */
	public ResultTO(String message) {
		this.message = message;
	}

	/**
	 * Gets the.
	 *
	 * @param key
	 *            the key
	 * 
	
	 * @return the string */
	public String get(String key) {
		return props.get(key);
	}

	/**
	 * Gets the action type.
	 *
	 * 
	
	 * @return the action type */
	public int getActionType() {
		return actionType;
	}

	/**
	 * Gets the first element.
	 *
	 * 
	
	 * @return the first element */
	public T getFirstElement() {
		return records[0];
	}

	/**
	 * Gets the message.
	 *
	 * 
	
	 * @return the message */
	public String getMessage() {
		return message;
	}

	/**
	 * Gets the message type.
	 *
	 * 
	
	 * @return the message type */
	public int getMessageType() {
		return messageType;
	}

	/**
	 * Gets the offset.
	 *
	 * 
	
	 * @return the offset */
	public int getOffset() {
		return offset;
	}

	/**
	 * Gets the records.
	 *
	 * 
	
	 * @return the records */
	public T[] getRecords() {
		return records;
	}

	/**
	 * Gets the records as list.
	 *
	 * 
	
	 * @return the records as list */
	public ArrayList<T> getRecordsAsList() {
		ArrayList<T> list = null;
		if (records != null && records.length > 0) {
			list = new ArrayList<T>();
			Collections.addAll(list, records);
		}

		return list;
	}

	/**
	 * Gets the search count.
	 *
	 * 
	
	 * @return the search count */
	public int getSearchCount() {
		return searchCount;
	}

	/**
	 * Gets the value.
	 *
	 * 
	
	 * @return the value */
	public T getValue() {
		return value;
	}

	/**
	 * Checks if is success.
	 *
	 * 
	
	 * @return true, if is success */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the.
	 *
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void set(String key, String value) {
		if (props == null) {
			props = new HashMap<String, String>();
		}
		props.put(key, value);
	}

	/**
	 * Sets the action type.
	 *
	 * @param actionType
	 *            the new action type
	 */
	public void setActionType(int actionType) {
		this.actionType = actionType;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Sets the message type.
	 *
	 * @param messageType
	 *            the new message type
	 */
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset
	 *            the new offset
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Sets the records.
	 *
	 * @param records
	 *            the new records
	 */
	public void setRecords(T[] records) {
		this.records = records;
	}

	/**
	 * Sets the search count.
	 *
	 * @param searchCount
	 *            the new search count
	 */
	public void setSearchCount(int searchCount) {
		this.searchCount = searchCount;
	}

	/**
	 * Sets the success.
	 *
	 * @param success
	 *            the new success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	public void setValue(T value) {
		this.value = value;
	}

}
