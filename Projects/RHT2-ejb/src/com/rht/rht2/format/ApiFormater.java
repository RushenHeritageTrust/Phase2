/*
 *
 */
package com.rht.rht2.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rht.rht2.enums.ApiFormat.ApiFormats;
import com.rht.rht2.model.LoginTO;
import com.rht.rht2.model.ResultTO;
import com.rht.rht2.util.exception.ApiInvalidRequestException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class ApiFormater.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ApiFormater {

	/**
	 * Field data.
	 */
	private static Object data;

	/** The logger. */
	private static Logger LOGGER = LoggerFactory.getLogger(ApiFormater.class);

	/**
	 * Method applyXStreamAlias.
	 *
	 * @param xstream
	 *            XStream
	 * @param data2
	 *            the data2
	 *
	
	 * @throws Exception
	 *             the exception */
	private static void applyXStreamAlias(XStream xstream, Object data2)
			throws Exception {
		// custom formatter
		try {

			xstream.setMode(XStream.ID_REFERENCES);

			xstream.registerConverter(new DateConverter());
			xstream.registerConverter(new UTF8Converter());

			final OutputDateConverter dateConverter = new OutputDateConverter();

			// xstream.registerLocalConverter(VetGroup.class, "modified",
			// dateConverter);
			xstream.registerLocalConverter(LoginTO.class, "createdOn",
					dateConverter);
			xstream.registerLocalConverter(LoginTO.class, "deletedOn",
					dateConverter);
			xstream.registerLocalConverter(LoginTO.class, "modified",
					dateConverter);
			xstream.registerLocalConverter(LoginTO.class, "registerDate",
					dateConverter);

			xstream.aliasSystemAttribute(null, "class");
			xstream.aliasSystemAttribute(null, "id");

		} catch (NullPointerException e) {
			e = new NullPointerException("Null pointer exception on XStream");
			LOGGER.error(e.getLocalizedMessage());
			throw e;
		}
	}

	/**
	 * Method formatAsJSON.
	 *
	 * @param data2
	 *            List<? extends CLApiDataTO>
	 *
	 *
	
	 * @return String * @throws Exception the exception * @throws Exception
	 */
	private static String formatAsJSON(Object data2) throws Exception {

		final XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
		xstream.setMode(XStream.NO_REFERENCES);
		applyXStreamAlias(xstream, data2);

		return xstream.toXML(data2);
	}

	/**
	 * Method formatAsXML.
	 *
	 * @param data2
	 *            List<? extends CLApiDataTO>
	 *
	 *
	
	 * @return String * @throws Exception the exception * @throws Exception
	 */
	private static String formatAsXML(Object data2) throws Exception {

		try {
			final XStream xstream = new XStream(new StaxDriver());
			applyXStreamAlias(xstream, data2);

			return xstream.toXML(data2);
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Method formatXmlToResult.
	 *
	 * @param internalXml
	 *            String
	
	
	 * @return T * @throws Exception */
	@SuppressWarnings("unchecked")
	public static <T> T formatXmlToResult(String internalXml) throws Exception {
		XStream xstream = new XStream(new StaxDriver());

		xstream.registerConverter(new UTF8Converter());

		xstream.alias("Result", ResultTO.class);

		new OutputDateConverter();

		return (T) xstream.fromXML(internalXml);
	}

	/**
	 * Method returnAsFormat.
	 *
	 *
	 * @param format
	 *            ApiFormat
	 * @param result
	 *            the result
	 *
	 *
	
	 * @return String * @throws Exception the exception * @throws Exception
	 */
	public static String returnAsFormat(ApiFormats format, ResultTO<?> result)
			throws Exception {
		String formatedData = "";

		if (result != null) {
			if (result != null) {
				data = result;
			}

			switch (format) {
			case XML:
				formatedData = formatAsXML(data);
				break;
			case JSON:
				formatedData = formatAsJSON(data);
				break;

			default:
				formatedData = formatAsXML(data);
				break;
			}
		} else {
			formatedData = "No Data Found";
			throw new ApiInvalidRequestException("No Data Found");

		}

		return formatedData;
	}
}
