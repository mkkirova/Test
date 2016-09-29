package introåoJava;

import java.util.Scanner;
public class VatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enetr prise:");
		double  prise = sc.nextDouble();
		double vat = prise*0.2;
		
		System.out.println("the VAT of" + prise + "$ is" + vat + "$");

	}

}
