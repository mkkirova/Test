package introåoJava;
import java.util.Scanner;
public class TaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter salary:");
		double salary = scanner.nextDouble();
		
		double tax = 0;
		if (salary>2000) {
			tax = salary * 0.1;
			salary = salary - tax;	
		}
		System.out.println("The tax is " + tax);
		System.out.println("The salary is " + salary);
	}

}
