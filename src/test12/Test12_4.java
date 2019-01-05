package test12;

class MyException extends Exception{
	private String string;
	public MyException(String string) {
		this.string=string;
}
	public void getString() { System.out.println(string);}
}
public class Test12_4 {
	public static void main(String[] args) {
		try {
			System.out.println("test myException!");
			throw new MyException("MyException xiao");
		}catch (MyException e) {
			e.printStackTrace(System.out);
			e.getString();
			// TODO: handle exception
		}
	}

}
