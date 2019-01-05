package test12;

import learn.Print;

class Father{
	int[] a = {1,2,3};
	Father() throws ArrayIndexOutOfBoundsException{
		System.out.println(a[3]);
	}
}
public class Test12_21 extends Father{
	public Test12_21() {
//		throw new ArrayIndexOutOfBoundsException("throw by test12");
	}
	public static void main(String[] args) {
		try {
			Test12_21 t = new Test12_21();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(System.out);
			System.out.println("throw by main");
		}
	}
}
