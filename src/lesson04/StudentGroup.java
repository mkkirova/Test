package lesson04;

public class StudentGroup {
	
	String subject;
	Student[] students;
	int freePlaces;
	//конструктор по подразбиране който създава места за 5 студента в групата
	//(инициализира полето students с нов масив от 5 елемента) и задава стойност 5 на полето freePlaces 
	
	StudentGroup() {
		this.students = new Student[5];
		freePlaces = 5;
	}
	// констуктор StudentGroup(String subject) които първо извиква конструктора по подразбиране и задава стойност на полето groupSubject 
	
	StudentGroup(String subject) {
		this();
		this.subject = subject;
	}
	// метод void addStudent(Student s) който добавя студент към групата(добавя го към масива на следващата празна позиция)
	// ако специалността на студента съвпада с тази на групата, и разбира се,
    // ако има свободни места. След добавяне на студент към групата да се намалят свободните места в групата. 
	
	void addStudent(Student s) {
		if(!s.subject.equals(this.subject)) {
			System.out.println(s.name +" has different subject!");
			return;
		}
		if(freePlaces == 0) {
			System.out.println("Sorry, there is not free place");
			return;
		}
		students[students.length - freePlaces] = s;
		freePlaces--;
	}
	
	//метод void emptyGroup() който освобождава всички места в групата (задава нов празен масив за полето students) и задава стойност 5 за полето 
	void emptyGroup() {
		freePlaces = 5;
		students = new Student[5];
	}
	
	// -метод theBestStudent() - Връща името на студента с най-висок успех в групата
	
	String findBestStudent() {
		// be careful of the group have students
		Student bestStudent = students[0];
		
		for (int i = 1; i < students.length - freePlaces; i++) {
			if(students[i].grade > bestStudent.grade) {
				bestStudent = students[i];
			}
		}
		return bestStudent.name;
	}
	
	// метод printStudentsInGroup() - Изкарва информация (Име, успех, ...)за всички студент в курса
	
	void printStudentsInGroup() {
		for (int i = 0; i < students.length - freePlaces; i++) {
			System.out.println("Name:" + students[i].name + " age: " + students[i].age );
		}
	}
}
