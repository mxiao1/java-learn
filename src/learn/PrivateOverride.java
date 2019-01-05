package learn;
import static learn.Print.*;

class Shared{
	private boolean flag = false;
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		
		print("creating " + this);
	}
	public void addRef() { refcount++;}
	protected void dispose() {
		if (--refcount == 0) {
			print("disposing " + this);
			flag = true;
		}
		
	}
	public void finalize() { //终结条件;
		if (flag) {print("quit ok!");}
	}
	public String  toString() {
		return "shared " + id;
	}
}

class Composing{
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		print("creating "+this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
	}
	public String toString() { return "composing" + id; }
	
}
public class PrivateOverride{
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = {new Composing(shared),
				new Composing(shared),new Composing(shared),new Composing(shared)};
		for ( Composing c: composings) {
			c.dispose();
		}
	}
}