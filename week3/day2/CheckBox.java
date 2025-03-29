package week3.day2;

public class CheckBox extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox cb = new CheckBox();
		cb.click();
		cb.submit();
		cb.clickCheckButton();

	}
	
	public void clickCheckButton() {
		System.out.println("The Check Box has been Selected --> checkbox");
	}

}
