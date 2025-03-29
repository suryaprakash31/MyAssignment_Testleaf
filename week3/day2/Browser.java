package week3.day2;

public class Browser {
	String browserName, browserVersion;
	public void openURL() {
		System.out.println("Open the URL ----> Browser");
	}
	
	public void closeBrowser() {
		System.out.println("Close the Browser ----> Browser");
	}
	
	public void navigateBack() {
		System.out.println("Navigate to the back/Next Page ----> Browser");
	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.closeBrowser();
		br.openURL();
		br.navigateBack();
	}

}

