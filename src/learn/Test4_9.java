package learn;

public class Test4_9 {
	public static void main(String[] args) {
		int stop = Integer.parseInt(args[0]);//命令行第一个整数参数
		int j=0,k=1,m;
		System.out.println(k);
		for(int i=0; i<stop-1; i++)
		{
			m = j + k;
			j = k;
			k = m;
			System.out.println(m);
		}
	}
}
