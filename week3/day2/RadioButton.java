package week3.day2;

public class RadioButton extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rb = new RadioButton();
		rb.click();
		rb.selectRadioButton();
		rb.submit();

	}
	
	public void selectRadioButton() {
		System.out.println("The Option has been Selected ----> RadioBtn");
	}

}
