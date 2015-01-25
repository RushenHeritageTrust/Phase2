/*
 *
 */
package com.rht.rht2.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class DateConverter.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class DateConverter implements Converter {

	/** The formatter. */
	private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thoughtworks.xstream.converters.ConverterMatcher#canConvert(java.
	 * lang.Class)
	 */
	/**
	 * Method canConvert.
	 * @param clazz Class
	 * @return boolean
	 * @see com.thoughtworks.xstream.converters.ConverterMatcher#canConvert(Class)
	 */
	@Override
	public boolean canConvert(Class clazz) {
		// This converter is only for Calendar fields.
		return Date.class.isAssignableFrom(clazz);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thoughtworks.xstream.converters.Converter#marshal(java.lang.Object,
	 * com.thoughtworks.xstream.io.HierarchicalStreamWriter,
	 * com.thoughtworks.xstream.converters.MarshallingContext)
	 */
	@Override
	public void marshal(Object value, HierarchicalStreamWriter writer,
			MarshallingContext context) {

		writer.setValue(formatter.format(value));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thoughtworks.xstream.converters.Converter#unmarshal(com.thoughtworks
	 * .xstream.io.HierarchicalStreamReader,
	 * com.thoughtworks.xstream.converters.UnmarshallingContext)
	 */
	/**
	 * Method unmarshal.
	 * @param reader HierarchicalStreamReader
	 * @param context UnmarshallingContext
	 * @return Object
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader, UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		Date date = new Date();
		try {
			date = formatter.parse(reader.getValue());
		} catch (final ParseException e) {
			throw new ConversionException(e.getMessage(), e);
		}
		return date;
	}
}