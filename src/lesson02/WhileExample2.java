package lesson02;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int i = 1;
		
		while(i >= n) {
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
			i--;
		}
	}

}
