package test13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static learn.Print.*;

public class Test13_1 {

	int i;
	long L;
	float f;
	double d;
	String s;
	Test13_1(String s) {
		Scanner sc = new Scanner(s);
		sc.useDelimiter("\\s*,\\s*");
		print(sc.delimiter());
		i = sc.nextInt();
		L = sc.nextLong();
		f = sc.nextFloat();
		d = sc.nextDouble();
		this.s = sc.next(); 
		sc.close();
	}
	public String toString() {
		return i + " " + L + " " + f + " " + d + " " + s;
	}
	public static void main(String[] args) {
		Test13_1 s20 = new Test13_1("17,56789,2.7,3.61412,hhhhhh");
		System.out.println(s20);
	}
}
