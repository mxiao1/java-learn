package Test7;


class A{
	A(){
		System.out.println("a");
}
}
class B{
	B(){		
		System.out.println("b");
	}
}
public class Test7_5 extends A {
	B b;
	public static void main(String[] args) {
		Test7_5 t = new Test7_5();
	}

}
