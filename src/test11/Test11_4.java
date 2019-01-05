package test11;
import java.util.*;
import static learn.Print.*;
class Generator{
	private int key = 0;
	public String next() {
		switch(key) {
		default:
		case 0 :key++;return "小龙女";
		case 1 :key++;return "今德保";
		case 2 :key++;return "顾客意思";
		case 3 :key++;return "干嘛呢";
		case 4 :key++;return "呵呵";
		case 5 :key=0;return "爸爸";
		}
	}
	public String[] fillA(String[] s) {
		for(int i=0;i<s.length;i++) {
			s[i] = next();
		}
		return s;
	}
	public Collection<String> fill(Collection<String> collection){
		for (int i=0;i<10;i++) {
			collection.add(next());
		}
		return collection;
	}
}
public class Test11_4 {
	public static void main(String[] args) {
		Generator g = new Generator();
		String[] aStrings =new String[10];
		g.fillA(aStrings);
		for (String s:aStrings) print(s);
		print();
		print(g.fill(new ArrayList<String>()));
		print(g.fill(new LinkedList<String>()));
		print(g.fill(new HashSet<String>()));
		print(g.fill(new TreeSet<String>()));
		print(g.fill(new LinkedHashSet<String>()));
		
	}

}
