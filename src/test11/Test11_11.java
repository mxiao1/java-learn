package test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//class MyCollection{
//	
//}
public class Test11_11 {
	static void Print(Iterator<Integer> t) {
		while(t.hasNext()) {
			Integer P = t.next();
			System.out.print(P.toString()+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> aL = new LinkedList<Integer>(a);
		HashSet<Integer> aHS = new HashSet<Integer>(a);
		TreeSet<Integer> aTS = new TreeSet<Integer>(a);
		Print(a.iterator());
		Print(aL.iterator());
		Print(aHS.iterator());
		Print(aTS.iterator());
	}

}
