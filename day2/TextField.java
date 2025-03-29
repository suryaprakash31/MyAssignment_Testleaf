package week3.day2;

public class TextField extends WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField tf = new TextField();
		tf.click();
		tf.getText();

	}
	public void getText() {
		System.out.println("The Text has been getted ----> Text Field");
	}

}
