package com.linux.kamp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeDb {

	private static Map<String, Object> storage;
	
	static{
		storage =  new HashMap<String, Object>();
	}
	
	public static boolean save(String key, Object value){
		storage.put(key, value);
		return true;
	}

	public static Collection<Object> getAllUsers() {
		return storage.values();
		
	}
}
