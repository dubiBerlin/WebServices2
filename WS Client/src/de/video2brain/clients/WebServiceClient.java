package de.video2brain.clients;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import de.video2brain.services.TestWebService;
import de.video2brain.services.TestWebServiceService;

public class WebServiceClient {

	public static void main(String[] args) throws MalformedURLException {
		
		
		// Referenz auf den eigentlichen WebService
		TestWebServiceService service = null;//new TestWebServiceService();
		
		
		File file = new File("TestWebService.wsdl");
		String fullPath = file.getAbsolutePath();
		URL url = new URL("file:///"+fullPath);
		service = new TestWebServiceService(url);
		
		
		
		TestWebService port = service.getTestWebServicePort();
		
	
		
		// Zugriff auf Methoden muss konfiguriert werden da der WebService 
		// durch den Container gesichert ist.
		// Durch den BindingProvider kann man weitere Informationen der Anfrage an den Service
		// stellen.
		BindingProvider prov = (BindingProvider)port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "dudo");
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "12345");
		
		String response = port.sayHello("Dubi");
		
		System.out.println(response);
		
		port.doSomethingVeryLongLast(10);
		System.out.println("Long lasting Method called");
	}

}
