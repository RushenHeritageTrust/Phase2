package com.rht.rht2.api.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.rht.rht2.constants.HttpConstants;
import com.rht.rht2.enums.ApiFormat.ApiFormats;
import com.rht.rht2.util.StringHelper;

// TODO: Auto-generated Javadoc
/**
 * The Class ParameterHelper.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ParameterHelper {

	/** The sdf. */
	public static String API_DATE_FORMAT = "yyyy-MM-dd-HH-mm-ss";

	/**
	 * Method decode.
	 *
	 * @param data
	 *            String
	 *
	 *
	 * @return String
	 */
	private static String decode(String data) {
		String content = null;

		if (StringHelper.isStringPopulated(data)) {
			content = data.replace("|", "");
			try {
				content = URLDecoder.decode(content, "UTF-8");
			} catch (final UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		return content;
	}

	/**
	 * Method encode.
	 *
	 * @param data
	 *            String
	 * @return String
	 */
	public static String encode(String data) {
		String content = null;

		if (StringHelper.isStringPopulated(data)) {
			try {
				content = URLEncoder.encode(data, "UTF-8");
			} catch (final UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		return content;
	}

	/**
	 * Gets the date.
	 *
	 * @param date
	 *            the date
	 *
	 *
	 * @return the date * @throws Exception the exception
	 */
	public static long getDate(String date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(API_DATE_FORMAT);
		return sdf.parse(date).getTime();
	}

	/**
	 * Method setFingerPrint.
	 *
	 * @param in
	 *            the in
	 * @param paramMap
	 *            Map<String,String>
	 *
	 *
	 * @return the string * @throws Exception the exception
	 */
	public static String setFingerPrint(String in, Map<String, String> paramMap)
			throws Exception {
		String out = in;
		if (paramMap.containsKey(HttpConstants.API_KEY_API_FINGER_PRINT)) {
			final String value = paramMap
					.get(HttpConstants.API_KEY_API_FINGER_PRINT);
			if (StringHelper.isStringPopulated(value) && value.length() > 2) {
				out = decode(value);
			} else {
				final Exception e = new Exception(
						"RTD Api : Api Finger Print value not set, requires URL encoding.");
				e.printStackTrace();
				throw e;
			}
		} else {
			final Exception e = new Exception(
					"RTD Api : API Finger Print parameter (FP) not set, can not proceed");
			e.printStackTrace();
			throw e;
		}

		return out;
	}

	/**
	 * Method setFormat.
	 *
	 * @param in
	 *            the in
	 * @param paramMap
	 *            Map<String,String>
	 *
	 *
	 * @return the api format * @throws Exception the exception
	 */
	public static ApiFormats setFormat(ApiFormats in,
			Map<String, String> paramMap) throws Exception {
		ApiFormats out = in;
		if (paramMap.containsKey(HttpConstants.API_KEY_FORMAT)) {
			final String value = paramMap.get(HttpConstants.API_KEY_FORMAT);
			final ApiFormats f = ApiFormats.type(decode(value));
			if (f != null) {
				out = f;
			} else {
				final StringBuilder sb = new StringBuilder(
						"API format not identified, Invalid value set.");
				sb.append("\n valid values are:\n");
				for (final ApiFormats op : ApiFormats.values()) {
					sb.append(op.value());
					sb.append(" \n ");
				}
				final Exception e = new Exception(sb.toString());
				e.printStackTrace();
				throw e;
			}
		} else {
			final Exception e = new Exception(
					"API: Format parameter (F) not set, can not proceed");
			e.printStackTrace();
			throw e;

		}
		return out;

	}

	/**
	 * Method setKey.
	 *
	 * @param in
	 *            the in
	 * @param paramMap
	 *            Map<String,String>
	 *
	 *
	 * @return the string * @throws Exception the exception
	 */
	public static String setKey(String in, Map<String, String> paramMap)
			throws Exception {
		String out = in;
		if (paramMap.containsKey(HttpConstants.API_KEY_APIKEY)) {
			final String value = paramMap.get(HttpConstants.API_KEY_APIKEY);
			if (StringHelper.isStringPopulated(value) && value.length() > 3) {
				out = decode(value);
			} else {
				final Exception e = new Exception(
						"Api: ApiKey value not set, requires URL encoding.");
				e.printStackTrace();
				throw e;
			}
		} else {
			final Exception e = new Exception(
					"Api: KEY parameter (KEY) not set, can not proceed");
			e.printStackTrace();
			throw e;
		}
		return out;
	}

	/**
	 * Method setPassword.
	 *
	 * @param in
	 *            the in
	 * @param paramMap
	 *            Map<String,String>
	 *
	 *
	 * @return the string * @throws Exception the exception
	 */
	public static String setPassword(String in, Map<String, String> paramMap)
			throws Exception {
		String out = in;
		if (paramMap.containsKey(HttpConstants.API_KEY_PASS)) {
			final String value = paramMap.get(HttpConstants.API_KEY_PASS);
			if (StringHelper.isStringPopulated(value) && value.length() > 2) {
				out = decode(value);
			} else {
				final Exception e = new Exception(
						"Api: Password value not set, requires URL encoding.");
				e.printStackTrace();
				throw e;
			}
		} else {
			final Exception e = new Exception(
					"Api: Password parameter (PASS) not set, can not proceed");
			e.printStackTrace();
			throw e;
		}

		return out;
	}

}
