package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

import interfaces.Polygons;


//question1 : should we write break in switch when using return statement


public class Main {
	public static Scanner scan;
	
	private static void init() {
		scan = new Scanner(System.in);
	}
	
	private static void close() {
		scan.close();
	}
	
	public static void main(String[] args) {
		
		init();
		
		int choice = selectShape();
		Polygons shape = setShapeParameters(choice);
		
		if(shape!=null) {
			System.out.println("Area of the Selected Shape : " + shape.getArea());
		}
		
		System.out.println("Program Ended");
		close();
		
	}
		
	
	private static int selectShape() {
		
		int choice=0;
		
		System.out.println("PLease Type the Serial Number of shape you "
				+ "want to Work with");
		
		System.out.println("1. Sqaure");
		System.out.println("2. Rectangle");
		System.out.println("3. Circle");
		System.out.println("4. triangle");
		
		System.out.print("Type Your choice : " );
		
		try {
			choice=scan.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println(">>Please Type Only numerical Values");
			
		}catch(Exception e) {
			System.out.println(">>Some unexpected Error Occured! Retry");
		}
		
		return choice;
	}
	
	private static Polygons setShapeParameters(int choice) {
		
		Polygons shape = null;
		
		try {
			switch(choice) {
			case 1:
				shape = new Square();
				break;
			case 2:
				shape = new Rectangle();
				break;
			case 3:
				shape = new Circle();
				break;
			case 4:
				shape = new Triangle();
				break;
			default:
				System.out.println("please choose from the option above");
				break;
			}
		}catch(InputMismatchException e) {
			System.out.println(">>Please Type Integer Values Only! Try Again");
			
		}catch(Exception e) {
			System.out.println(">>Some unexpected Error Occured! Retry");
		}
		
		return shape;
	}
	
	
	private static double getShapeArea(Polygons shape) {
		return shape.getArea();
	}

}
