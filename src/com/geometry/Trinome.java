package com.geometry;

public class Trinome {
	private double a,b,c, delta;

	public Trinome(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.delta = b*b - 4*a*c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double findFirstZero() throws ArithmeticException{
		if(delta<0) {
			throw new ArithmeticException("no zero to this trinome");
		}
		return (Math.sqrt(delta)-b)/(2*a);
	}
	
	public double findSecondZero() throws ArithmeticException{
		if(delta<0) {
			throw new ArithmeticException("no zero to this trinome");
		}
		return (-Math.sqrt(delta)-b)/(2*a);
	}
	
	public void print() {
		System.out.println(a + ", " +b + ", " +c);
		System.out.println(delta);
	}
}
