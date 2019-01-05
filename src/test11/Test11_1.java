package test11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class Gerbil{
//	private static long counter;
	private int gerBilNumber;
	Gerbil(int gerBilNumber){
		this.gerBilNumber = gerBilNumber;
	}
	void hop() {
		System.out.println("沙鼠号码" + gerBilNumber + "正在跳跃!");
	}
//	public int id() { return gerBilNumber++; }
//	public static void hop(Iterator<Gerbil> t) {
//		while(t.hasNext()) {
//			Gerbil p = t.next();
//			System.out.print(p.id() + ": " + p+ " ");
//		}
//	}
}
public class Test11_1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils= new ArrayList<Gerbil>();
		for (int i =0; i<3;i++) {
			gerbils.add(new Gerbil(i));
		}
		Iterator<Gerbil> t = gerbils.iterator();
		while(t.hasNext()) {
			Gerbil g = t.next();
			g.hop();
		}
//		for(int i=0;i<gerbils.size();i++) {
//			gerbils.get(i).hop();
//		}
//		ArrayList<Gerbil> pets = new ArrayList<Gerbil>();
//		for (int i=0;i<3;i++) {
//			pets.add(new Gerbil());
//		}
//		LinkedList<Gerbil> petsLL = new LinkedList<Gerbil>(pets);
//		HashSet<Gerbil> petsHS = new HashSet<Gerbil>(pets);
//		TreeSet<Gerbil> petsTS = new TreeSet<Gerbil>(pets);
//		Gerbil.hop(pets.iterator());
//		Gerbil.hop(petsLL.iterator());
//		Gerbil.hop(petsHS.iterator());
//		Gerbil.hop(petsTS.iterator());
//		
	}

}
