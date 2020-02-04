package com.ssi;

import java.net.URI;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetExampleOne {

	
	//Testing getForObject
	
	
	public void readCourseAsString() throws Exception {
		System.out.println("Getting Course Details.....");
		String endpoint="http://localhost:8080/myapi/technologies/c111";
		URI uri=new URI(endpoint);
		RestTemplate template=new RestTemplate();
		String result=template.getForObject(new URI(endpoint), String.class);
		System.out.println(result);
	}

	public void readCourseAsCourse() throws Exception {
		System.out.println("Getting Course Details As Course Object.....");
		String endpoint="http://localhost:8080/myapi/technologies/c111";
		URI uri=new URI(endpoint);
		RestTemplate template=new RestTemplate();
		Course course=template.getForObject(new URI(endpoint), Course.class);
		System.out.println(course);
	}

}
