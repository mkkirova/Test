package homeWork;

import java.util.Scanner;
//Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.   
public class Zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B:");
		int b = sc.nextInt();
		
		if (a<b) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + "" +a);
		}

	}

}
