package Test7;

class Ab{
	void f(int i) {
		System.out.println("i");
	}
	void f(char i) {
		System.out.println("c");
	}
	void f(float i) {
		System.out.println("f");
	}
}
public class Test7_13 extends Ab{
	void f(String i) {
		System.out.println("s");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7_13 t = new Test7_13();
		t.f(2);
		t.f('a');
		t.f(12.23f);
		t.f("hello");

	}

}
