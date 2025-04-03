package week4.day1;

public class LearnOverriding extends LearnOverloading {

	public static void main(String[] args) {
		LearnOverriding lor = new LearnOverriding();
		lor.takeSnap();
		lor.reportStep();

	}
	
	public void takeSnap() {
		System.out.println("Snapshot has been taken through Overriding class");
	}

}
