/*
 *
 */
package com.rht.rht2.format;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import com.rht.rht2.util.StringHelper;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class OutputDateConverter.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class UTF8Converter implements Converter {

	/**
	 * The formatter. * @param clazz Class
	 * 
	
	
	 * @param clazz Class
	 * @return boolean * @see com.thoughtworks.xstream.converters.ConverterMatcher#canConvert(Class) */

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.thoughtworks.xstream.converters.ConverterMatcher#canConvert(java.
	 * lang.Class)
	 */
	@Override
	public boolean canConvert(Class clazz) {
		// used on targeted string values only.
		return String.class.isAssignableFrom(clazz);
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

		StringBuilder sb = new StringBuilder("");

		try {
			if (value instanceof String) {
				String str = (String) value;
				if (StringHelper.isStringPopulated(str)) {
					sb.append(URLEncoder.encode(str, "UTF-8"));
				}

			}

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		}

		// if (StringHelper.isStringPopulated(sb.toString())) {
		//
		// }

		writer.setValue(sb.toString());

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
	 * 
	 * @param reader
	 *            HierarchicalStreamReader
	 * @param context
	 *            UnmarshallingContext
	
	
	 * @return Object * @see com.thoughtworks.xstream.converters.Converter#unmarshal(HierarchicalStreamReader,
	 *      UnmarshallingContext) */
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		String str = reader.getValue();
		try {
			if (StringHelper.isStringPopulated(str)) {
				str = URLDecoder.decode(str, "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		}
		return str;
	}
}