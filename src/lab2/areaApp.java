package lab2;

import java.util.Scanner;

/*
 * @Author Kyle Warchuck
 */

public class areaApp {

	public static void main(String[] args) {
		char userInput = 'y';
		while (userInput == 'y') {
		
		Scanner scnr = new Scanner(System.in);
		
		double area;
		double perimeter;
		double volume;

		System.out.println("Enter the length: ");
		double length = scnr.nextDouble();
		
		System.out.println("Enter the width: ");
		double width = scnr.nextDouble();
		
		System.out.println("Enter the height");
		double height = scnr.nextDouble();

		area = (length * height);
		perimeter = (length * 2) + (width * 2);
		volume = (height * width * length);

		System.out.println("Area is " + area);
		System.out.println("Perimeter is " + perimeter);
		System.out.println("Volume is " + volume);
		
		
		System.out.println("Would you like to run this program again? y or n: ");
		userInput = scnr.next().charAt(0);
		
		
		}
	}

}


