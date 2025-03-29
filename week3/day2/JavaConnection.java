package week3.day2;

public class JavaConnection extends MySQLConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disConnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("Connection has been Established");
		
	}

	@Override
	public void disConnect() {
		System.out.println("Connection has been diconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update has been Executed");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Query has been executed");
		
	}

}
