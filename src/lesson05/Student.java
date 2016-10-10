package lesson05;

public class Student extends Person{
	private double score;
	
	
// ������ Student ���������� Person, ������������� ������ �� ��� ������: � score - ������� �������� �� ������� (����� ����� 2 � 6, �� � ������������ �� � ����)  
// ��������� �����������: � Student(String name, int age, boolean isMan, double score) ������� ��������� � �� ����������� ������  
// ����� showStudentInfo() ����� ������� ���������� �� ������ � ���������� �� �������� �� (���� ������� �� ������) 
	
	
	public Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.score = score;
	}

	public void showStudentInfo(){
		//call method of the superclass
		showPersonInfo();
		System.out.println("The students score is: " + score);
	}
}
