package homeWork;

import java.util.Scanner;
//Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте новите стойности 
public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  A:");
		int a = sc.nextInt();
		
		System.out.println("Enetr B: ");
		int b = sc.nextInt();
		
		int temp = b;
		b = a;
		a= temp;
		System.out.println("A is " + a);
		System.out.println("B is " +b);

	}

}
