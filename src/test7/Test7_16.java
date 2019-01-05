package test7;

class Amphibian{
	void f() {
		System.out.println("1221");
	}
}
class Frag extends Amphibian{
	void f() {
		System.out.println();
	}
	void m() {
		System.out.println("xiao");
	}
}
public class Test7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frag a = new Frag();
		a.f();
		a.m();

	}

}//向上转型
