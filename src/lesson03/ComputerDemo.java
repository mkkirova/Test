package lesson03;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer hp = new Computer(); // obekt
		Computer lenovo = new Computer(); // obekt
		
		
		//Stoinosti
		hp.year = 2000; 
		hp.hardDiscMemory = 200;
		hp.freeMemory = hp.hardDiscMemory;
		hp.isNotebook = false;
		hp.operationSystem = "Linux";
		hp.price = 1000;
		
		lenovo.year = 2010;
		lenovo.hardDiscMemory = 300;
		lenovo.freeMemory = hp.hardDiscMemory;
		lenovo.isNotebook = true;
		lenovo.operationSystem = "Windows";
		lenovo.price = 2000;
		
		lenovo.changeOperationSystem("Linux"); //  използване на метод
		lenovo.useMemory(300); // Izpolzvane na mеtod
		hp.useMemory(100);		
	}
}
