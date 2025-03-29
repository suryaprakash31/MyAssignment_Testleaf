package week3.day2;

public class Button extends WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Button bu = new Button();
		bu.setText("SuryaPrakash From Button class to Webelement");
		bu.submit();
		

	}
	public void submit() {
		System.out.println("This has been Submitted ---> button");
	}

}
