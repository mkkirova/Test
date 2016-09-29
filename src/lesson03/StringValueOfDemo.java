package lesson03;

public class StringValueOfDemo {

	public static void main(String[] args) {
    	
		String myNumber = "54";
		String myNumber2 = "43.4";
        // convert strings to numbers
		
		int c = Integer.valueOf(myNumber).intValue();
		System.out.println(c + 12);
        float a = (Float.valueOf(myNumber)).floatValue(); 
        float b = (Float.valueOf(myNumber2)).floatValue();

        // do some arithmetic
        System.out.println("a + b = " +
                           (a + b));
        System.out.println("a - b = " +
                           (a - b));
        System.out.println("a * b = " +
                           (a * b));
        System.out.println("a / b = " +
                           (a / b));
        System.out.println("a % b = " +
                           (a % b));
}
}