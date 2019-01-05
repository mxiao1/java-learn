package test10;

public class Test10_9 {
	private class Howxiao implements Test10_6{
		public void f(int i) { System.out.println(123+i);}
	}
	Test10_6 t() {
		return new Howxiao();
	}
	public static void main(String[] args) {
		Test10_9 ll = new Test10_9();
		ll.t().f(9);
		((Howxiao)ll.t()).f(10);//只有在这个类才可见,别的类Howxiao完全屏蔽
		}
}
