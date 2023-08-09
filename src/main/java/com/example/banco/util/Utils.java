package com.example.banco.util;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public final class Utils {
	static private Utils singleton = null;
	final static String regex = "^[0-9]{9}$";

	private Utils() { }

	static public Utils getInstance() {
		if (singleton == null) {
			singleton = new Utils();
		}
		return singleton;
	}

	public Boolean validateCode(String code) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(code);
		return matcher.matches();
	}
}
