package com.usaa.nflopoly.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonParser {

	public JsonParser() {}
	
	public static String readFile(String filename) {
	    String result = "";
	    try {
	        BufferedReader br = new BufferedReader(new FileReader(filename));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        while (line != null) {
	            sb.append(line);
	            line = br.readLine();
	        }
	        result = sb.toString();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	

	
	public  JSONObject parseFile(String fileName) {
		
		String jsonData = readFile(fileName);
	    JSONObject jobj = null;
		try {
			jobj = new JSONObject(jsonData);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return jobj;
//	    JSONArray jarr = new JSONArray(jobj.getJSONArray("keywords").toString());
//	    System.out.println("Name: " + jobj.getString("name"));
//	    for(int i = 0; i < jarr.length(); i++) {
//	        System.out.println("Keyword: " + jarr.getString(i));
//	    }
		
	}
}
