package com.bilgeadam.melih.globalization;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Strings {
	private static final String BUNDLE_NAME = "com.bilgeadam.melih.globalization.strings"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Strings() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
