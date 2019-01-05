package test5;

class Animal2{ //在同一个包中,不能有相同名字的类;
	Animal2() {
		// TODO Auto-generated constructor stub
		System.out.println("hi!");
	}
	Animal2(String s){
		System.out.println("hello\t" + s);
	}
}

public class Test5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Animal2("xiao");

	}

}
