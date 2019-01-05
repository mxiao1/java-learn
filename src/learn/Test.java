package learn;
//工厂方法设计模式
import static learn.Print.*;



interface Selector{
	boolean end();
	Object current();
	void next();
}
public class Test{
	private Object[] items;
	private int next = 0;
	public Test(int size) { items = new Object[size]; }
	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}
	private class TestSelector implements Selector{
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if (i<items.length) i++;}
	}
	public Selector selector() {
		return new TestSelector();
	}
	public static void main(String[] args) {
		Test test = new Test(10);
		for (int i=0; i<10;i++)
			test.add(Integer.toString(i));
		Selector selector = test.selector();
		while(!selector.end()) {
			print(selector.current() + " ");
			selector.next();
		}
	}
}