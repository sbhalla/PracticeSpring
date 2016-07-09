package com.practice.spring_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleDrawMain {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_bean.xml");
	/*	TriangleFactory triangle = (TriangleFactory) context.getBean("triangle1");*/
//		TriangleDraw triangle = (TriangleDraw) context.getBean("triangle1");
		
		TrianglePoints triangle=(TrianglePoints)context.getBean("triangle5");
		
		triangle.draw();
		
	}
}
