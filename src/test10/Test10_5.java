package test10;

class Outter{
	class Inner{
		
	}
}
public class Test10_5 {
	public static void main(String[] args) {
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
	}

}
