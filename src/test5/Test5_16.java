package test5;

import java.util.Random;



public class Test5_16 {
	public static void main(String[] args) {
	Random rand = new Random();
	String[] s = new String[rand.nextInt(5)];
	System.out.println(s.length);
	for (int i =0;i<s.length;i++) {
		s[i] = "xx" + rand.nextInt(10);
	}
	for(String i: s) {
		System.out.println(i);
	}
	
	}
}
