package introåoJava;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 3; // 0000 0011 = 3
		short b = 5; // 0000 0101 = 5
		String firstName = "Ivan";
		String lastName = "Ivanov";
		String fullName = firstName + " " + lastName;
		// Print the result ot the console
		System.out.println("Hello, " + firstName+ "");
		System.out.println("Your full name is " + fullName + ".");
		System.out.println( a | b); // 0000 0111 = 7
		System.out.println( a & b); // 0000 0001 = 1
		System.out.println( a ^ b); // 0000 0110 = 6
		System.out.println(~a & b); // 0000 0100 = 4
		System.out.println(a << 1); // 0000 0110 = 6
		System.out.println(a << 2); // 0000 1100 = 12
		System.out.println(a >> 1); // 0000 0001 = 1
	}

}
