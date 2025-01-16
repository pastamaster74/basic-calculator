package basiccalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("select a method:");
			System.out.println("1 = addition \n2 = deduction \n3 = multiplication \n4 = division \n5 = end");
			
			int method = scanner1.nextInt();
			
			if (method == 5) {
				break;
			}
		
			System.out.println("Enter a number");
			int number1 = scanner1.nextInt();
	
			System.out.println("Enter a second number");
			
			int number2 = scanner1.nextInt();
			
			
			
			if (method == 1) {
				int result = number1 + number2;
				System.out.println("result: " + result);
			} else if (method == 2) {
				int result = number1 - number2;
				System.out.println("result: " + result);
			} else if (method == 3) {
				int result = number1 * number2;
				System.out.println("result: " + result);
			} else if (method == 4) {
				int result = number1 * number2;
				System.out.println("result: " + result);
			} else {
				System.out.println("nope");
			}
		
		}

	}

}
