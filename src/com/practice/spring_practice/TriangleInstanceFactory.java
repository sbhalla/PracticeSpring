package com.practice.spring_practice;

public class TriangleInstanceFactory {

private TriangleFactory triangleFactory= new TriangleFactory(); 
	
	public TriangleInstanceFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public TriangleFactory getTriangleInstance()
	{
		return triangleFactory;
	}
}
