package com.restlet.demo.application;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.restlet.demo.resource.HelloWorldResource;

public class RestletApplication extends Application{
	
	public synchronized Restlet createInboundRoot() {
		 // Create a router Restlet that routes each call to a new instance of HelloWorldResource.
		Router router = new Router(getContext());
		
		router.attach("/helloWorld",HelloWorldResource.class);
		
		return router;
	}
}