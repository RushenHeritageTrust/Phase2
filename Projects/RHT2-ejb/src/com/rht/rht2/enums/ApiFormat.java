/*
 *
 */
package com.rht.rht2.enums;

import com.rht.rht2.constants.HttpConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class GlobalApiFormat.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ApiFormat {

	/**
	 * The Enum ApiFormat.
	 *
	 * @author Rob
	 * @version $Revision: 1.0 $
	 */
	public enum ApiFormats {

		/** The json. */
		JSON(HttpConstants.API_VALUE_FORMAT_TYPE_JSON),
		/** The xml. */
		XML(HttpConstants.API_VALUE_FORMAT_TYPE_XML), XMLINT(
				HttpConstants.API_VALUE_FORMAT_TYPE_XMLINT);

		/**
		 * Method name.
		 *
		 * @param value
		 *            String
		 *
		
		 * @return String */
		public static String name(String value) {
			if (value == null) {
				return null;
			} else if (value.equalsIgnoreCase(ApiFormats.XML.value())) {
				return ApiFormats.XML.name();
			} else if (value.equalsIgnoreCase(ApiFormats.JSON.value())) {
				return ApiFormats.JSON.name();
			}

			return null;
		}

		/**
		 * Method type.
		 *
		 * @param value
		 *            String
		 *
		
		 * @return ConversationTypes */
		public static ApiFormats type(String value) {
			if (value == null) {
				return null;
			} else if (value.equalsIgnoreCase(ApiFormats.XML.value())) {
				return ApiFormats.XML;
			} else if (value.equalsIgnoreCase(ApiFormats.JSON.value())) {
				return ApiFormats.JSON;
			}

			return null;
		}

		/**
		 * Method value.
		 *
		 * @param name
		 *            String
		 *
		
		 * @return String */
		public static String value(String name) {
			if (name == null) {
				return null;
			}
			ApiFormats value = null;
			try {
				value = ApiFormats.valueOf(name);
			} catch (final Exception ex) {
			}
			return value == null ? null : value.value();
		}

		/** The value. */
		private final String value;

		/**
		 * Constructor for ConversationTypes.
		 *
		 * @param value
		 *            String
		 */
		ApiFormats(String value) {
			this.value = value;
		}

		/**
		 * Method value.
		 *
		 *
		
		 * @return String */
		public String value() {
			return value;
		}

	}

}
