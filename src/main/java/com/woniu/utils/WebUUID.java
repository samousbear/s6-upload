package com.woniu.utils;

import java.util.UUID;

public class WebUUID {
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
