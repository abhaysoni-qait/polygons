package shapes;

import java.util.InputMismatchException;

import interfaces.Polygons;

public class Square implements Polygons{
	
	private double length;

	@Override
	public double getArea() {
		return length*length;
	}

	public double getLength() {
		return length;
	}
	
	public Square() throws InputMismatchException {
		System.out.print("Type the square length : " );
		this.length = Main.scan.nextDouble();
	}
	

}
