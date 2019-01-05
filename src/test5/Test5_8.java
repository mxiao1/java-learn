package test5;

class WhichThis{
	void one() {
		two();
		this.two();
	}
	void two() {
		System.out.println("hehe");
	}
}
public class Test5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhichThis w = new WhichThis();
		w.one();

	}

}
