package week3.day2;

public class Safarib extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safarib sa = new Safarib();
		sa.readerMode();
		sa.fullScreenMode();
		sa.openURL();
		// sa.takeSnap() ---> Not accepting this Method because this Subclass directly
		// inherits the property of SuperClas browser. So it not inheriting the property
		// of another subclass such as chormeb, Edgeb

	}

	public void readerMode() {
		System.out.println("Open the reader mode ----> Safarib");
	}

	public void fullScreenMode() {
		System.out.println("Click on the Full Screen Mode ----> Safarib");
	}

}
