package introåoJava;

import java.util.Scanner;

public class ScanerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your age:");
		int expectedFromKeyboard = scanner.nextInt();
		System.out.println("Your age is" + expectedFromKeyboard);
		
		System.out.println("Enter your height:");
		double height = scanner.nextDouble();
		System.out.println("Your height is " + height);
		
		System.out.println("Ponedelnik li e?");
		boolean isMonday = scanner.nextBoolean();
		
		if(isMonday){
			System.out.println("Uuuuu ponedelnik ujas");
		} else {
			System.out.println("Yeee ne e ponedelnik");
		}

				

	}

}
