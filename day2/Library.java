package week1.day2;

public class Library {
	
	String addBook(String bookTitle) {
		System.out.println("Book added Succesfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}

	public static void main(String[] args) {
		Library lib = new Library();
		String bookName = lib.addBook("Digital Signal Porcessing");
		System.out.println("The Book name is " + bookName);
		lib.issueBook();
		

	}

}
