package lesson03;

public class Computer {

		int year;
		double price;
		boolean isNotebook;
		double hardDiscMemory;
		double freeMemory;
		String operationSystem; // deklarirane 
		
		//конструктор по подразбиране Computer() който инициализира полето isNotebook със стойност false, и полето operationSystem с „Win XP“
		
		Computer() {
			isNotebook = false;
			operationSystem = "Win XP";
		}
		
		//  констуктор с параметри Computer(int year, double price, double hardDiskMemory, double freeMemory),
		//  който първо извиква конструктора по подразбиране и после инициализира останалите полета със стойностите подадени като аргументи
		
		Computer (int year, double price, double hardDiscMemory, double freeMemory){
			this(); //Извиква конструктора по подразбиране
			this.year = year;
			this.price = price;
			this.hardDiscMemory = hardDiscMemory;
			this.freeMemory = freeMemory; // inicializara poletata sys stoinosti podadenti kato parametri
		}
		
		//конструктор с параметри, който инициализира всички полета със стойностите подадени като аргументи на конструктора. 
		
		Computer (int year, double price, boolean isNotebook, double hardDiscMemory,double freeMemory, String operationSystem) {
			this.year = year;
			this.price = price;
			this.isNotebook = isNotebook;
			this.hardDiscMemory = hardDiscMemory;
			this.freeMemory = freeMemory;
			this.operationSystem = operationSystem;
		}
		
		// метод int comparePrice(Computer c), който сравнява цените на 2 компютъра.
		// Ако цената на първия компютър (този, за който се вика метода) е по висока от тази на компютъра подаден като аргумент, 
		// метода връща -1. Ако цената на компютъра подаден като аргумент е по-високата, се връща 1, а ако са равни, метода връща стойност 0. 
		
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
