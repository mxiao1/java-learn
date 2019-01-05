package test5;

class Dog{
	
	void bark() {
		System.out.println("barking");
	}
	void bark(String s) {
		System.out.println("howing\t" + s);
	}
}
public class Test5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.bark("xiao");
	}

}
