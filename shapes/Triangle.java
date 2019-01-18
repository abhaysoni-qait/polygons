package shapes;

import java.util.InputMismatchException;

import interfaces.Polygons;

public class Triangle implements Polygons{

	private double height;
	private double base;
	
	@Override
	public double getArea() {
		return 0.5*height*base;
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

	public Triangle() throws InputMismatchException {
		super();
		System.out.print("Type the Triangle height : " );
		this.height = Main.scan.nextDouble();
		System.out.print("Type the Triangle base : " );
		this.base = Main.scan.nextDouble();
	}

}
