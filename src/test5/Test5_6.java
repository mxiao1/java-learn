package test5;

class Dog2{
	void bark(String s,int i) {
		System.out.println(s + 2*i);
	}
	void bark(int i, String s) {
		System.out.println(s + i);
	}
}
public class Test5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d2 = new Dog2();
		d2.bark(1, "xiao");
		d2.bark("xiao", 1);

	}

}
