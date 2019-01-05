package test12;

public class Test12_1 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch (Exception e) {
//			System.out.println("exception");
			e.printStackTrace(System.out);
		}finally {
			System.out.println("go go go");
		}
	}
}
