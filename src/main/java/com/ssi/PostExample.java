package com.ssi;

import org.springframework.web.client.RestTemplate;

public class PostExample {
	
	public void createCoruse() {
		String endpoint="http://localhost:8080/myapi/technologies";
		Course course=new Course();
		course.setCcode("c116");
		course.setCname("SpringRest");
		course.setSubject("java");
		course.setDuration(4);
		course.setFees(23000);
		
		RestTemplate template=new RestTemplate();
		Course c=template.postForObject(endpoint, course, Course.class);
		System.out.println("CREATED : "+c);
	}
}
