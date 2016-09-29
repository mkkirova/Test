package lesson02;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter rows: ");
		int maxRow = sc.nextInt();
		
		int col = 1;
		int number = 1;
		
		int row = 1;
		while (row<=maxRow) {
			col = 1;
			number = row;
			while(col <= maxRow) {
				System.out.print(number + " ");
				number = number + row;
				col++;
			}
			System.out.println();
			row++;
			}
		}
}
