package assignment;

import java.util.Scanner;

public class CubeCalculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		scan.close();
		int cube = CalculateCube(number);
		System.out.println("Cube of " + number + " is " + cube);
	}
}
