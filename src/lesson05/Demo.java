package lesson05;

public class Demo {

	private static final int ARRAY_LENGTH = 10;
	private static final double OVERTIME_HOURS_WORKED = 2;

	public static void main(String[] args) {
		Person[] people = new Person[ARRAY_LENGTH];
		
		Person ivan = new Person("Ivan", 30, true);
		Student jose = new Student("Josefina", 16, false, 5.5);
		Employee koce = new Employee("Koce", 28, true, 1000.5);
		Employee pesho = new Employee("Petyr", 17, true, 250.8);
		
		people[0] = ivan;
		people[1] = jose;
		people[2] = koce;
		people[3] = pesho;
		
		for(Person p : people) {//for each
			//for(int i=0;i<people.lenth;i++)
			//Person p = people[i];
			if(p != null) {
				System.out.println("");
				if (p instanceof Student) {
					((Student) p).showStudentInfo();
					continue;
				}
				if (p instanceof Employee) {
					((Employee) p).showEmployeeInfo();
					continue;
				}
				if (p instanceof Person) {
					p.showPersonInfo();
				}
			}
		}
		
		System.out.println("---------Overtime---------");
		
		for(Person p : people) {
			if(p != null && p instanceof Employee) {
				double overtime = ((Employee) p).calculateOvertime(OVERTIME_HOURS_WORKED);
				System.out.println(p.getName() + "'s overtime is " + overtime + "\n");
			}
		}
		
		
	}

}