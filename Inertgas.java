package com.satyam.finalkeyword;

public final class Inertgas extends Gas{
	
	private int atomicNumber;
	private float atomicWeight;
		
	public Inertgas() {
		super();
	}
	public Inertgas(int atomicNumber, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
	}
	
	public void showGas()
	{
		System.out.println("Inert gas");
	}
	
	
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public float getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(float atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "Inertgas [atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight + ", getAtomicNumber()="
				+ getAtomicNumber() + ", getAtomicWeight()=" + getAtomicWeight() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
