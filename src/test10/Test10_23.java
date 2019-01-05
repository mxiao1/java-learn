package test10;
interface U{
	void a();
	String b(String s);
	void c();
}
class A{
	U getU() {
		return new U() {
			private String string;
			public void a() {System.out.println("a");}
			public String b(String s) { return string;}
			public void c() {System.out.println("c");}
		};
	}
}
class B{
	private String s="x";
	U[] u = new U[2];
	void Ba(U uu,int i) {
		u[i] = uu;
	}
	void Hh() {
		System.out.println(u[1].toString());
	}
	void Bb(int i) { u[i]=null;}
	void Bc() { 
		for (U x:u) {
			x.a();
			x.b(s);
			x.c();
		}
	}
	void Bd() {
		for(U i:u)
			if (i==null) {System.out.println("null");}
	}
}
public class Test10_23 {
	public static void main(String[] args) {
		A aa = new A();
//		A aa1 = new A();
		B bb = new B();
		U uu = aa.getU();
//		U uu1 = aa1.getU();
		bb.Ba(uu, 0);
//		bb.Ba(uu1, 1);
		bb.Bc();
		bb.Hh();
		bb.Bb(0);
//		bb.Bb(1);
		bb.Bd();
//		bb.Bb(1);
	}

}
