package introňoJava;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testscore = 76;
		char  grade;
		
		if (testscore >=90) {
			grade = 'A';
		} else if (testscore>=80) {
			grade = 'B';
		} else if (testscore>=60) {
			grade = 'C';
		} else { 
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}

}
