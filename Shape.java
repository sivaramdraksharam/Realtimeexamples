package com.satyam.superkeyword;

public class Shape {
	private String shapeName;
	private int vertex;
	
	public Shape() {
		//calls super class constructor -  here Object class constructor
		super();
	}
	public Shape(String shapeName, int vertex) {
		super();
		this.shapeName = shapeName;
		this.vertex = vertex;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public int getVertex() {
		return vertex;
	}
	public void setVertex(int vertex) {
		this.vertex = vertex;
	}
	
	

}
