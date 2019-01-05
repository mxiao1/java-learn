package test5;

import java.util.Random;

class Array5_17{
	Array5_17(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("hi" + s);
	}
}
public class Test5_17 {
	public static void main(String[] args) {
		Random rand = new Random();
		Array5_17[] a = new Array5_17[3];
		for (int i =0; i < 3; i++) {
			a[i] = new Array5_17(Integer.toString(i));
		}
	}

}
