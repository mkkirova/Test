package homeWork;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter time:");
		int time = sc.nextInt();
		
		System.out.println("Enter money:");
		double money = sc.nextDouble();
		
		System.out.println("Are you ok?");
		boolean health = sc.nextBoolean();
		
		if(health == false) {
			System.out.println("I am ill and won't go to disco");
			if (money > 0) {
				System.out.println("I will buy pills.");
			} else {
				System.out.println("I will drink tea at home :)");
			}
		} else if (money < 10) {
			System.out.println("I will go to the cafe");
		}
		

	}

}
