package lesson04;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollage;
	int age;
	boolean isDegree;
	double money;
	
	
//-конструктор по подразбиране който задава следните стойностите на полетата: grade = 4.0, yearInCollege = 1, isDegree = false, money = 0 
	
	Student() {
		grade = 4;
		yearInCollage = 1;
		isDegree = false;
		money = 0;
	}
	
//	констуктор с параметри които извиква конструктора по подразбиране и инициализира(задава първоначални стойности) останалите полета на класа
	
	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
// Mетод void upYear() който увеличава годината в колежа с единица, ако студента не е завършил, в противен случай извежда подходящо съобщение.
//Ако след увеличаването годината стане 4, задава true на полето isDegree 
	void upYear() {
		if(isDegree) {
			System.out.println("The student is degree");
			return;
		}
		yearInCollage ++;
		if(yearInCollage == 4) {
			isDegree = true;
		}
	}
//метод double receiveScholarship(double min, double amount) – добавя сумата amount кум парите на студента, 
//само ако успеха му е по-висок или равен на минималния успех подаден като параметър (min) и ако възрастта му е под 30 години
	
	
	double receiveScholarship(double min, double amount) {
		if(grade > min && age < 30) {
			money += amount;
		}
		return money;
	}
}
