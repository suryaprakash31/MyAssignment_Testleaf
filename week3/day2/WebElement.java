package week3.day2;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement we = new WebElement();
		we.click();
		we.setText("Surya");

	}
	
	public void click() {
		System.out.println("The Button is Clicked ---> WebElement");
	}
	
	public void setText(String text) {
		String webElementText = text;
		System.out.println("The Text value is set as " + text);
		
	}

}
