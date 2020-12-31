package com.geometry;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrique q = new Quadrique(1, 1, 1, 2, 2, 2, 2, 2, 2, 1);
		Conique c = q.createConique(0);
		c.print();
		Trinome t = c.createTrinome(0);
		t.print();
		System.out.println(t.findFirstZero());
		System.out.println(t.findSecondZero());
	}

}
