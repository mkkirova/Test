package homeWork;

import java.util.Scanner;
//�������� 2 �������� ����� �� ��������� � �������� ���������� ��. ������������ ������ ��������� 
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
