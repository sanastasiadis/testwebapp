package org.stavros.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWsImpl {
	
	@WebMethod
	public String getHelloWorldMessage(String string) {
		return("Hello "+string+" to JAX WS world");
	}
}
