package multilevelInheritance;

public class Audi extends Car{

	public static void main(String[] args) {
		Audi model = new Audi();
		
		model.vehicle();
		model.car();
		model.audi();
		
		
	}
		
	public void audi() {
		System.out.println("Car model is audi");
	}
	
	}
	

