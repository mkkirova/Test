package lesson03;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 858.48;
	    String s = Double.toString(d);
	    System.out.println(d);
	    int dot = s.indexOf('.');
	    System.out.println(dot);
	   System.out.println(dot + "digits" + "before decimal point.");
	   System.out.println((s.length() - dot -2) + "digits after decimal point");

	}

}
