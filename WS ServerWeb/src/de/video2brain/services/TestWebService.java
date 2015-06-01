package de.video2brain.services;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class TestWebService {

	@WebMethod
	public String sayHello(String name){
		return "Hello "+name;
	}

	@WebMethod 
	public void doSomethingVeryLongLast(int waitInterval) throws InterruptedException{
		Thread.sleep(waitInterval*1000);
	}
}
