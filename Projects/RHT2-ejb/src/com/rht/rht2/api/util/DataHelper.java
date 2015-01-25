package com.rht.rht2.api.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class DataHelper.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class DataHelper {

	/**
	 * Gets the as big decimal.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the as big decimal
	 */
	public static BigDecimal getAsBigDecimal(double value) {
		return new BigDecimal(Double.toString(value));
	}

	/**
	 * Gets the as double.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the as double
	 */
	public static Double getAsDouble(BigDecimal value) {
		return value == null ? null : value.doubleValue();
	}

	/**
	 * Gets the boolean.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the boolean
	 */
	public static boolean getBoolean(int value) {
		return value > 0 ? true : false;
	}

	/**
	 * Gets the boolean.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the boolean
	 */
	public static boolean getBoolean(Integer value) {
		boolean b = false;
		if (value != null && value > 0) {
			b = true;
		}
		return b;
	}

	/**
	 * Gets the date.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the date
	 */
	public static long getDate(Date value) {
		return value == null ? -1 : value.getTime();
	}

	/**
	 * Gets the date.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the date
	 */
	public static Date getDate(long value) {
		return value > 0 ? new Date(value) : null;
	}

	/**
	 * Gets the date.
	 *
	 * @param date
	 *            the date
	 * 
	 * @return the date
	 */
	public static Date getDate(Timestamp date) {
		return date == null ? null : new Date(date.getTime());
	}

	/**
	 * Gets the date as long.
	 *
	 * @param date
	 *            the date
	 * 
	 * @return the date as long
	 */
	public static long getDateAsLong(Timestamp date) {
		return date == null ? -1 : date.getTime();
	}

	/**
	 * Gets the date as long object.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the date as long object
	 */
	public static Long getDateAsLongObject(Date value) {
		return value == null ? null : value.getTime();
	}

	/**
	 * Method getDateAsTimestamp.
	 * 
	 * @param value
	 *            Date
	 * @return Timestamp
	 */
	public static Timestamp getDateAsTimestamp(Date value) {
		return value == null ? null : new Timestamp(value.getTime());
	}

	/**
	 * Gets the flag.
	 *
	 * @param value
	 *            the value
	 * @param mask
	 *            the mask
	 * 
	 * @return the flag
	 */
	public static boolean getFlag(int value, int mask) {
		return (value & mask) == mask ? true : false;
	}

	/**
	 * Gets the integer.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the integer
	 */
	public static Integer getInteger(boolean value) {
		int x = 0;
		if (value) {
			x = 1;
		}
		return new Integer(x);
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static double getValue(BigDecimal value) {
		return value == null ? -1 : value.doubleValue();
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static Boolean getValue(boolean value) {
		return value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static boolean getValue(Boolean value) {
		return value == null ? false : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static Double getValue(double value) {
		return value > 0 ? null : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static double getValue(Double value) {
		return value == null ? -1 : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static Integer getValue(int value) {
		return value > 0 ? value : null;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static int getValue(Integer value) {
		return value == null ? -1 : value;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static Long getValue(long value) {
		return value > 0 ? value : null;
	}

	/**
	 * Gets the value.
	 *
	 * @param value
	 *            the value
	 * 
	 * @return the value
	 */
	public static long getValue(Long value) {
		return value == null ? -1 : value;
	}

	/**
	 * Sets the hour minute second to zero plus24 hours.
	 *
	 * @param datetime
	 *            the datetime
	 * 
	 * @return the date
	 */
	public static Date setHourMinuteSecondToZeroPlus24Hours(Date datetime) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(datetime);
		calendar.set(Calendar.HOUR, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.AM_PM, 0);
		return calendar.getTime();
	}

}
