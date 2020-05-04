package test;

import app.shape.Cylinder;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(3, 5);
		System.out.println(cylinder.toString());
		System.out.println("Total area:   " + cylinder.getArea());
		System.out.println("Total around: " + cylinder.getAreaAround());
		System.out.println("Volume:       " + cylinder.getVolume());
	}
}
