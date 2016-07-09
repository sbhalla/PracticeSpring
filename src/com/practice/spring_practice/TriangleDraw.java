package com.practice.spring_practice;

import java.beans.ConstructorProperties;

public class TriangleDraw {

	private String type;
	private int angle;

	@ConstructorProperties({"type","angle"})
	public TriangleDraw(String type, int angle) {
		super();
		this.type = type;
		this.angle = angle;
	}

	public void draw() {
		System.out.println(" Triangle drawn at angle ");
	}

	public TriangleDraw(int angle) {
		super();
		System.out.println("Angle constructor");
		this.angle = angle;
	}

	public TriangleDraw(String type) {
		super();
		System.out.println("Type constructor");
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

}
