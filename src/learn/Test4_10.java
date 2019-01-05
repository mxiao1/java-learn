package learn;

import java.util.Random;

public class Test4_10 {
	static int a(int i) {
		return i/1000;
	}
	static int b(int i) {
		return (i%1000)/100;
	}
	static int c(int i) {
		return ((i%1000)%100)/10;
	}
	static int d(int i) {
		return ((i%1000)%100%10);
	}
	static int com(int i,int j) {
		return i * 10 + j;
	}
	static void productTest(int i,int m, int n) {
		if (i==m*n) System.out.println(i + "==" + m + "*" + n);
	}
	public static void main(String[] args) {
		//随机取1001~9999的整数
//		Random rand = new Random();
//		int random = rand.nextInt(10000) + 1001;
		for (int i=1001; i<10000; i++) {
			productTest(i, com(a(i), b(i)), com(c(i), d(i)));
			productTest(i, com(a(i), b(i)), com(d(i), c(i)));
			productTest(i, com(a(i), c(i)), com(b(i), d(i)));
			productTest(i, com(a(i), c(i)), com(d(i), b(i)));
			productTest(i, com(a(i), d(i)), com(b(i), c(i)));
			productTest(i, com(a(i), d(i)), com(c(i), b(i)));
			productTest(i, com(b(i), a(i)), com(c(i), d(i)));
			productTest(i, com(b(i), a(i)), com(d(i), c(i)));
			productTest(i, com(b(i), c(i)), com(d(i), a(i)));
			productTest(i, com(b(i), d(i)), com(c(i), a(i)));
			productTest(i, com(c(i), a(i)), com(d(i), a(i)));
			productTest(i, com(c(i), a(i)), com(d(i), b(i)));
		}
	}
}
