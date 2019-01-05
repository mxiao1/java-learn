package learn;

import java.util.Random;

interface TossCoin{
	void Toss();
}
interface TossCoinFactory{
	TossCoin getTossCoin();
}
class Toss1 implements TossCoin{
	static Random random = new Random();
	int r = random.nextInt(2);
	public void Toss() {
		if (r==0)
			System.out.println("正面");
		else {
			System.out.println("反面");
		}
	}
	public static TossCoinFactory tossfactory=
		new TossCoinFactory() {
		public TossCoin getTossCoin() {
			return new Toss1();
		}
	};
}
class Dice implements TossCoin{
	int r = Toss1.random.nextInt(6);
	public void Toss() {
		switch (r) {
		case 0:System.out.println("1点");break;
		case 1:System.out.println("2点");break;
		case 2:System.out.println("3点");break;
		case 3:System.out.println("4点");break;
		case 4:System.out.println("5点");break;
		case 5:System.out.println("6点");break;
		default:
		}
	}
	public static TossCoinFactory tossfactory=
			new TossCoinFactory() {
		public TossCoin getTossCoin() {
			return new Dice();
		}
	};
}
public class Test10_16 {
	public static void playGame(TossCoinFactory s) {
		TossCoin t = s.getTossCoin();
		t.Toss();
	}
	public static void main(String[] args) {
		playGame(Toss1.tossfactory);
		playGame(Dice.tossfactory);
	}

}
