/*
 *
 */
package com.rht.rht2.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.joda.time.DateTime;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractModuleDAOBean.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public abstract class AbstractModuleDAOBean {

	/**
	 * Gets the as double.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the as double */
	protected static Double getAsDouble(BigDecimal value) {
		return value == null ? null : value.doubleValue();
	}

	/**
	 * Gets the boolean.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the boolean */
	protected static boolean getBoolean(int value) {
		return value > 0 ? true : false;
	}

	/**
	 * Gets the date.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the date */
	protected static long getDate(Date value) {
		return value == null ? -1 : value.getTime();
	}

	/**
	 * Gets the date.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the date */
	protected static Date getDate(long value) {
		return value > 0 ? new Date(value) : null;
	}

	/**
	 * Gets the date.
	 *
	 * @param date
	 *            the date
	 * 
	
	 * @return the date */
	protected static Date getDate(Timestamp date) {
		return date == null ? null : new Date(date.getTime());
	}

	/**
	 * Gets the flag.
	 *
	 * @param value
	 *            the value
	 * @param mask
	 *            the mask
	 * 
	
	 * @return the flag */
	protected static boolean getFlag(int value, int mask) {
		return (value & mask) == mask ? true : false;
	}

	/**
	 * Gets the formated date.
	 *
	 * @param date
	 *            the date
	 * 
	
	 * @return the formated date */
	protected static String getFormatedDate(Long date) {
		if (date == null) {
			return "";
		}

		final DateTime value = new DateTime(date);
		return value.toString("dd/MM/yyyy");
	}

	/**
	 * Gets the string.
	 *
	 * @param referralId
	 *            the referral id
	 * 
	
	 * @return the string */
	protected static String getString(int referralId) {

		return String.valueOf(referralId);
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static Boolean getValue(boolean value) {
		return value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static boolean getValue(Boolean value) {
		return value == null ? false : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static Double getValue(double value) {
		return value > 0 ? null : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static double getValue(Double value) {
		return value == null ? -1 : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static Integer getValue(int value) {
		return value > 0 ? value : null;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static int getValue(Integer value) {
		return value == null ? -1 : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static Long getValue(long value) {
		return value > 0 ? value : null;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static long getValue(Long value) {
		return value == null ? -1 : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	
	 * @return the value */
	protected static String getValue(String value) {
		return value == null ? "" : value;
	}
}
