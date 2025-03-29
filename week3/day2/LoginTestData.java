package week3.day2;

public class LoginTestData extends TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterPassword();
		ltd.enterUserName();
		ltd.navigateToHome();

	}
	
	public void enterUserName() {
		System.out.println("Enter the Username ---> LoTeDa");
	}
	
	public void enterPassword() {
		System.out.println("Enter the Password ----> LoTeDa");
	}

}
