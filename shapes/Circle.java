package shapes;

import java.util.InputMismatchException;

import interfaces.Polygons;


/*
 * Shape circle 
 */
public class Circle implements Polygons{
	
	private double radius;

	@Override
	public double getArea() {
		return radius*2*3.14;
	}

	public double getRadius() {
		return radius;
	}
	
	public Circle() throws InputMismatchException {
		System.out.print("Type the circle radius : " );
		this.radius = Main.scan.nextDouble();
	}

}
