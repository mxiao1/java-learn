package learn;

import Test10.Test10_6;

public class ToTest10_6 {
	protected class Xiao implements Test10_6{
		private int n;
		public void f(int i) { System.out.println("123");}
		public void g() { System.out.println(n); }
	}
	public Test10_6 t() {
		return new Xiao();
	}
//	public String toString() {
//		return " " + n;
	
	public static void main(String[] args) {
		ToTest10_6 to = new ToTest10_6();
		Test10_6 too = to.t();
		((ToTest10_6.Xiao)too).g();
	}

}
