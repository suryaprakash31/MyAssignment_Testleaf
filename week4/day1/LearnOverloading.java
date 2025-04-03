package week4.day1;

public class LearnOverloading {

	public static void main(String[] args) {
		LearnOverloading lol = new LearnOverloading();
		lol.reportStep();
		lol.reportStep("overloading", "second method");
		lol.reportStep("Overloading", "ThirdMethod", true);
		lol.takeSnap();
		

	}
	
	public void reportStep() {
		
		System.out.println("This is executed through PolyMorphism method 1");
	}
	
	public void reportStep(String msg, String status) {
		System.out.println("The Message"+ msg + " is passed through 2nd method");
		System.out.println("Currently in " + status);
		
	}
	
	public void reportStep(String msg, String status, boolean takeSnape) {
		System.out.println("The Message"+ msg + " is passed through 3rd method");
		System.out.println("Currently in " + status);
		System.out.println(takeSnape + ", The Snap has been taken through 3rd method");
		
	}
	
	public void takeSnap() {
		System.out.println("Snapshot has been taken through overloading class");
	}
	

}
