package Test10;


class Study{
	Study(int i){System.out.println("learn\t" + i);}
	String f() { 
	return "ff";}
}

public class Test10_15 {
	public Study study(final int i) {
		return new Study(i) {};
			
		}
	public static void main(String[] args) {
		Test10_15 tt = new Test10_15();
		tt.study(10);
	}
}
