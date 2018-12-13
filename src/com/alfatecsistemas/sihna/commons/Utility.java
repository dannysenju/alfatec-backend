package com.alfatecsistemas.sihna.commons;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * class for common and transversal methods to the api
 * 
 * @author danny
 *
 */
public class Utility {

	private static Utility instance = new Utility();

	private Utility() {
	}

	/**
	 * access method to the singleton instance
	 * 
	 * @return
	 */
	public static Utility getInstance() {
		return instance;
	}

	/**
	 * Easy way to convert Iterable to List
	 * 
	 * @param iterable
	 * @return
	 */
	public <T> List<T> toList(final Iterable<T> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
	}

}
