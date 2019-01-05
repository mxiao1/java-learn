package test12;

import java.util.Random;

public class Test12_5 {
	static Random rand = new Random();
	private static boolean flag = false;
	public static void main(String[] args) {
		while(!flag) {
			try {
				System.out.println(3/rand.nextInt(2));
				flag = true;
			}catch (Exception e) {
				e.printStackTrace(System.out);
				System.out.println("除数为零,重新运行!");
				// TODO: handle exception
			}
		}
	}

}
