package test5;

enum Coins{
	fIVE,SIX,SEVEN,EIGHT,TEN
}
public class Test5_21 {
	Coins coins;
	public Test5_21(Coins coins) {
		// TODO Auto-generated constructor stub
		this.coins=coins;
	}
	void f() {
		switch (coins) {
		case fIVE:
			System.out.println("five...");
			break;
		case SIX:
			System.out.println("six...");

		default:System.out.println("bbbb");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5_21 
		test5_21 =new Test5_21(Coins.fIVE),
		test5_212 = new Test5_21(Coins.SIX);
		test5_21.f();
		test5_212.f();
		}

	}


