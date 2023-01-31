package com.kitap.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

public class Log {

	

	private static final Logger LOGGER = LogManager.getLogger(Log.class.getName());

	public static void info(String message) {

		LOGGER.info(message);

	}

	public static void warn(String message) {

		LOGGER.warn(message);

	}

	public static void error(String message) {

		LOGGER.error(message);

	}

	public static void fatal(String message) {

		LOGGER.fatal(message);

	}

	public static void debug(String message) {

		LOGGER.debug(message);

	}

	public static void reportLine(String message) {
		LOGGER.info(message);
		Reporter.log(message + " <br/>", true);
	}

}
