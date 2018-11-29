package com.ait;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Testing {
	
	@WebMethod
	String func(String name);

}
