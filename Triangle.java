package com.satyam.superkeyword;

public class Triangle extends Shape {
	
	private float base;
	private float height;
	public Triangle() {
		super();
	}
	public Triangle(float base, float height) {
		//calling constructor of Shape
		//super(); super must be the first statement
		super("Triangle",3);
		this.base = base;
		this.height = height;
	}
	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return super.getShapeName();
	}
	@Override
	public void setShapeName(String shapeName) {
		// TODO Auto-generated method stub
		super.setShapeName(shapeName);
	}
	@Override
	public int getVertex() {
		// TODO Auto-generated method stub
		return super.getVertex();
	} 
	@Override
	public void setVertex(int vertex) {
		// TODO Auto-generated method stub
		super.setVertex(vertex);
	}
	@Override
	public String toString() {
		return super.getShapeName()+" has "+ this.getVertex()+" vertex"+"[base=" + base + ", height=" + height + "]";
	}
	
}
