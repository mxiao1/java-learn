package test10;

public interface Test10_20 {
	void f();
	class Animal implements Test10_20{
		public void f() { System.out.print("a");}
		public static void main(String[] args) {
			Animal animal = new Animal();
			animal.f();
		}
	}
}
