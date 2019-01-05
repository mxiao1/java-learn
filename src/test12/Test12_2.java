package test12;

class Myobject{ void f() {}
}
public class Test12_2 {
	static Myobject myobject = null;
	public static void main(String[] args) {
		try {
			myobject.f();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		
	}
}

