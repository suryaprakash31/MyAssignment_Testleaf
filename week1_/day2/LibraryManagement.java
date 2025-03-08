package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib1 = new Library();
		String bookName = lib1.addBook("Digital Signal Porcessing");
		System.out.println("The Book name is " + bookName);
		lib1.issueBook();

	}

}
