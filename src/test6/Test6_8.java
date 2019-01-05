package test6;

import java.util.Random;

class Connection{
	Random rand = new Random();
	private Connection() {
		System.out.println("xx" + rand.nextInt(10));
	}
	static Connection makeConne() {
		return new Connection();
	}
}
class ConnectionManager{
	public ConnectionManager() {
		// TODO Auto-generated constructor stub
	}
	private Connection[] a = {Connection.makeConne(),Connection.makeConne()};
	public Connection makeConn(int i) {
		if (i>=a.length) {
			System.out.println("no more obj");
			return null;
		}
		System.out.println(a[i-1].toString());
		return a[i-1];
	}
}
public class Test6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		c.makeConn(3);
	}

}
