package week3.day2;

public class Edgeb extends Chromeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edgeb ed = new Edgeb();
		ed.navigateBack();
		ed.clearCache();
		ed.takeSnap();
		ed.clearCookies();

	}
	
	public void takeSnap() {
		System.out.println("Take Screenshot ----> edgeb");
	}
	
	public void clearCookies() {
		System.out.println("Clear the Cookies ----> edgeb");
	}

}
