package learn;


class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	@Override
	public void run()
	{
		for (int i =0; i<10; i++)
		{
			System.out.println(this.name + i);
		}
	}
}
public class TestDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread("线程a");
		MyThread t1 = new MyThread("线程b");
		t.start();
		t1.start();
	}
	
}