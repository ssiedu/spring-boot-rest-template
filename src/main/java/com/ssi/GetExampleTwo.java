package com.ssi;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetExampleTwo {
	
	//Testing GetForEntity
	//getting single entity
	public void readCourseAsEntity() throws Exception {
		System.out.println("Getting Entity.....");
		String endpoint="http://localhost:8080/myapi/technologies/c111";
		URI uri=new URI(endpoint);
		RestTemplate template=new RestTemplate();
		ResponseEntity<Course> entity=template.getForEntity(uri, Course.class);
		System.out.println(entity.getStatusCodeValue());
		System.out.println(entity.getStatusCode());
		System.out.println(entity.getHeaders().getContentType());
		Course course=entity.getBody();
		System.out.println(course);
	}
	//getting multiple entities
	public void readCourseAllCoursesAsEntity() throws Exception {
		System.out.println("Getting Entity.....");
		String endpoint="http://localhost:8080/course";
		URI uri=new URI(endpoint);
		RestTemplate template=new RestTemplate();
		ResponseEntity<Course[]> entity=template.getForEntity(uri, Course[].class);
		System.out.println(entity.getStatusCodeValue());
		System.out.println(entity.getStatusCode());
		System.out.println(entity.getHeaders().getContentType());
		Course courses[]=entity.getBody();
		for(Course course:courses) {
			System.out.println(course);
		}
	}
}
