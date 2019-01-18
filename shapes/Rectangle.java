package shapes;

import java.util.InputMismatchException;

import interfaces.Polygons;

public class Rectangle implements Polygons{
	
	private double length;
	private double breadth;
	
	@Override
	public double getArea() {
		return length*breadth;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}


	public Rectangle() throws InputMismatchException {
		super();
		System.out.print("Type the Rectangle length : " );
		this.length = Main.scan.nextDouble();;
		System.out.print("Type the Rectangle breadth : " );
		this.breadth = Main.scan.nextDouble();;
	}
	
	
	

}
