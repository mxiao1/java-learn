package test5;

public class Test5_19 {
	static void f(String... s) {
		for (String i: s) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f("xiao","qing","guang");
		f(new String[] {"xiao","xx","xxx"});

	}

}
