package week3.day2;

public class Chromeb extends Browser {
	
	public void openIncognito() {
		System.out.println("Open the Incognito mode ----> Chromeb");
	}
	
	public void clearCache() {
		System.out.println("Clear the Cache ----> Chromeb");
	}

	public static void main(String[] args) {
		Chromeb ch = new Chromeb();
		ch.clearCache();
		ch.openIncognito();
		ch.closeBrowser();
		ch.openURL();
	}

}
