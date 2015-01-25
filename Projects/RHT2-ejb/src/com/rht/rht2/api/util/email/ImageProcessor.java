/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rht.rht2.api.util.email;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ImageProcessor {
	/**
	 * @author Rob
	 * @version $Revision: 1.0 $
	 */
	public class EmbeddedFile {
		public String fileName;
		public String imageName;

		/**
		 * Constructor for EmbeddedFile.
		 * 
		 * @param fileName
		 *            String
		 * @param imageName
		 *            String
		 */
		private EmbeddedFile(String fileName, String imageName) {
			this.fileName = fileName;
			this.imageName = imageName;
		}
	}

	private final List<EmbeddedFile> embeddedFiles = new ArrayList<EmbeddedFile>();
	private final Map<String, String> files = new HashMap<String, String>();

	private final String htmlContent;

	/**
	 * Constructor for ImageProcessor.
	 * 
	 * @param htmlContent
	 *            String
	 */
	public ImageProcessor(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	/**
	 * Method convertImageReferencesToEmbedded.
	 * 
	 * @param htmlContent
	 *            String
	
	
	 * @return String * @throws Exception */
	private String convertImageReferencesToEmbedded(String htmlContent)
			throws Exception {

		int pos = htmlContent.indexOf("<img src=");
		while (pos >= 0) {
			final int end = htmlContent.indexOf("\"", pos + 10);
			final String left = htmlContent.substring(0, pos);
			final String fileName = htmlContent.substring(pos + 10, end);
			final String right = htmlContent.substring(end + 1);
			final String imageName = processFile(fileName);
			htmlContent = left + "<img src=\"cid:" + imageName + "\"" + right;
			pos = htmlContent.indexOf("<img src=", pos + 10);
		}
		return htmlContent;
	}

	/**
	 * Method getEmbeddedFiles.
	 * 
	
	 * @return List<EmbeddedFile> */
	public List<EmbeddedFile> getEmbeddedFiles() {
		return embeddedFiles;
	}

	/**
	 * Method getFileNames.
	 * 
	
	 * @return String[] */
	public String[] getFileNames() {
		return files.keySet().toArray(new String[0]);
	}

	/**
	 * Method getImageName.
	 * 
	 * @param fileName
	 *            String
	
	
	 * @return String * @throws Exception */
	private String getImageName(String fileName) throws Exception {
		final File f = new File(fileName);
		if (!f.exists()) {
			throw new Exception("Failed to embedd reference to image "
					+ fileName + " as it doesn't exist.");
		}

		String name = f.getName();
		int pos = name.lastIndexOf("."); // Find file suffix
		name = name.substring(0, pos); // and strip it off
		pos = name.lastIndexOf("."); // Find image sequence number
		name = name.substring(pos + 1); // and extract it
		return "image-" + name;
	}

	/**
	 * Method getImageNames.
	 * 
	
	 * @return String[] */
	public String[] getImageNames() {
		return files.entrySet().toArray(new String[0]);
	}

	/**
	 * Method getNewContent.
	 * 
	
	
	 * @return String * @throws Exception */
	public String getNewContent() throws Exception {
		return convertImageReferencesToEmbedded(htmlContent);
	}

	/**
	 * Method processFile.
	 * 
	 * @param fileName
	 *            String
	
	
	 * @return String * @throws Exception */
	private String processFile(String fileName) throws Exception {
		String imageName = null;
		if (!files.containsKey(fileName)) {
			imageName = getImageName(fileName);
			files.put(fileName, imageName);
			embeddedFiles.add(new EmbeddedFile(fileName, imageName));
		} else {
			imageName = files.get(fileName);
		}

		return imageName;
	}
}
