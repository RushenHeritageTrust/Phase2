/*
 *
 */
package com.rht.rht2.http;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rht.rht2.constants.HttpConstants;
import com.rht.rht2.model.ApiFilterTO;

// TODO: Auto-generated Javadoc
/**
 * The Class URLBuilder.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class URLBuilder {

	/**
	 * Field LOGGER.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(URLBuilder.class);

	/** The Constant NEXT_PARAM. */
	private static final String NEXT_PARAM = "&";

	/** The Constant NVP. */
	private static final String NVP = "=";

	/**
	 * Builds the uri.
	 *
	 * @param filter
	 *            the filter
	 *
	
	 * @return the uri */
	public static URI buildURI(ApiFilterTO filter) {

		// http://localhost:8080/vetspace/RealTimeDataAPI?KEY=sdklsdofgnsdofgnsg&FP=jzsdfgiobnauiogbuisdbf&METHOD=AWAS

		URI uri = null;
		try {
			final URI x = new URI(filter.getDatasource());
			if (x.getPort() < 1) {
				if (x.getScheme().equalsIgnoreCase("http")) {
					uri = URIUtils.createURI(x.getScheme(), x.getHost(), 80,
							x.getPath(), buildURIParams(filter).toString(),
							null);
				} else if (x.getScheme().equalsIgnoreCase("https")) {
					uri = URIUtils.createURI(x.getScheme(), x.getHost(), 443,
							x.getPath(), buildURIParams(filter).toString(),
							null);
				}
			} else {
				uri = URIUtils.createURI(x.getScheme(), x.getHost(), x
						.getPort(), x.getPath(), buildURIParams(filter)
						.toString(), null);
			}

		} catch (final URISyntaxException e) {
			LOGGER.error("Unable to build URI for passed Site and filter.", e);
		}
		return uri;

	}

	/**
	 * Builds the uri params.
	 *
	 * @param filter
	 *            the filter
	 *
	
	 * @return the string builder */
	public static StringBuilder buildURIParams(ApiFilterTO filter) {

		try {
			final StringBuilder query = new StringBuilder();

			query.append(HttpConstants.API_KEY_APIKEY);
			query.append(NVP);
			query.append(filter.getKey());

			query.append(NEXT_PARAM);

			query.append(HttpConstants.API_KEY_FORMAT);
			query.append(NVP);
			query.append(filter.getFormat().value());

			query.append(NEXT_PARAM);

			query.append(HttpConstants.API_KEY_METHOD);
			query.append(NVP);

			return query;
		} catch (final Exception e) {

			LOGGER.error("Error while building request url parameters", e);
		}
		return new StringBuilder("");
	}

	// private static String createRemoteSiteFingerPrint(SiteTO SiteTO) {
	// return VoyagerEncryption.encrypt(SiteTO.getHostName());
	// }

}
