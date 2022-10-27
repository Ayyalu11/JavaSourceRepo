package com.java.practice.api11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import com.java.practice.HelloWorld;

public class APIClientTest {

	public static void main(String[] args) {
		HelloWorld  hw1 = new HelloWorld();
		hw1.setReturnMessage("Message From Setter!");
		System.out.println("Msg getter: "+ hw1.getReturnMessage());
		
		HelloWorld  hw2 = new HelloWorld("Message From Constructor!");
		
		System.out.println("Msg constructor: "+ hw2.getReturnMessage());
		
		HelloWorld  hw3 = new HelloWorld(211,45);
		System.out.println("Called hw3.toString Method: "+ hw3.toString());
		
		HttpClient httpClient = HttpClient.newBuilder()
								.version(HttpClient.Version.HTTP_2)
								.connectTimeout(Duration.ofSeconds(10))
								.build();
		
    try {
		HttpRequest httpRequest = HttpRequest
				.newBuilder()
				.GET()
				.uri(URI.create("https://www.microsoft.com"))
				.build();
		HttpResponse<String> httpResponse =httpClient
				.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status code: " + httpResponse.statusCode());                            
        System.out.println("Headers: " + httpResponse.headers().allValues("content-type"));
        System.out.println("Body: " + httpResponse.body());
	} catch (IOException | InterruptedException e) {
		e.printStackTrace();
	}
	}

}
