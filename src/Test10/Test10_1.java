package Test10;

public class Test10_1 {
	private int i = 0;
	class Inner{
		
	}
	public Inner f() {
		return new Inner();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10_1 t = new Test10_1();
		Test10_1.Inner s = t.f();
		
		

	}

}
