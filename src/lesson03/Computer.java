package lesson03;

public class Computer {

		int year;
		double price;
		boolean isNotebook;
		double hardDiscMemory;
		double freeMemory;
		String operationSystem; // deklarirane 
		
		//����������� �� ������������ Computer() ����� ������������ ������ isNotebook ��� �������� false, � ������ operationSystem � �Win XP�
		
		Computer() {
			isNotebook = false;
			operationSystem = "Win XP";
		}
		
		//  ���������� � ��������� Computer(int year, double price, double hardDiskMemory, double freeMemory),
		//  ����� ����� ������� ������������ �� ������������ � ����� ������������ ���������� ������ ��� ����������� �������� ���� ���������
		
		Computer (int year, double price, double hardDiscMemory, double freeMemory){
			this(); //������� ������������ �� ������������
			this.year = year;
			this.price = price;
			this.hardDiscMemory = hardDiscMemory;
			this.freeMemory = freeMemory; // inicializara poletata sys stoinosti podadenti kato parametri
		}
		
		//����������� � ���������, ����� ������������ ������ ������ ��� ����������� �������� ���� ��������� �� ������������. 
		
		Computer (int year, double price, boolean isNotebook, double hardDiscMemory,double freeMemory, String operationSystem) {
			this.year = year;
			this.price = price;
			this.isNotebook = isNotebook;
			this.hardDiscMemory = hardDiscMemory;
			this.freeMemory = freeMemory;
			this.operationSystem = operationSystem;
		}
		
		// ����� int comparePrice(Computer c), ����� �������� ������ �� 2 ���������.
		// ��� ������ �� ������ �������� (����, �� ����� �� ���� ������) � �� ������ �� ���� �� ��������� ������� ���� ��������, 
		// ������ ����� -1. ��� ������ �� ��������� ������� ���� �������� � ��-��������, �� ����� 1, � ��� �� �����, ������ ����� �������� 0. 
		
		int comparePrice(Computer comp) {
			if (price >comp.price){
			      return -1;	
			}
			if (price < comp.price) {
				return 1;
				
			}
			return 0;
			}
		
		
		
		
		void changeOperationSystem(String newOperationSystem) { // method 
			operationSystem = newOperationSystem; // smqna na stoinosti
			System.out.println("The new operation system is: " + newOperationSystem);
		}
		
		void useMemory(double memory) { //method
			if(memory > freeMemory) {
				System.out.println("There is not enought memory");
			} else {
				freeMemory = freeMemory - memory;
			}
		}
	}
