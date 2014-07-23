package com.restlet.demo.resource;

import java.util.Map;
import com.restlet.demo.core.ResponseParseFactory;
public class HelloWorldResource extends BaseResource {
	
	public String processRequest(Map json, String method) {
		
		String returnString = "" ;
		returnString = new ResponseParseFactory().getSuccessJsonString("Hello " + json.get("user"));
		return returnString;
	
	}
}