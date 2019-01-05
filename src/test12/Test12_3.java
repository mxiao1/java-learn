package test12;

public class Test12_3 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=i+1;
		try {
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(System.out);
		}
	}

}
