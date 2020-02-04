package com.ssi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestTemplateApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootRestTemplateApplication.class, args);
		
		/*GetExampleOne ob=new GetExampleOne();
		//ob.readCourseAsString();
		ob.readCourseAsCourse();*/
		
		/*GetExampleTwo ob=new GetExampleTwo();
		//ob.readCourseAsEntity();
		ob.readCourseAllCoursesAsEntity();*/
		
		PostExample ob=new PostExample();
		ob.createCoruse();
		
	}

}
