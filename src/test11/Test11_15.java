package test11;

import java.util.Stack;

public class Test11_15 {
	private final static Stack<Character> stack=new Stack<Character>();
	static void doSomething(String s){
		char[] ch = s.toCharArray();
//		int i=0;
		for (int i=0;i<ch.length;) {
			switch(ch[i++]) {
				case '+':stack.push(ch[i++]);break;//两个i++使得取值相隔一位
				case '-':System.out.print(stack.pop()+" ");
			}
		}
	}
	public static void main(String[] args) {
		doSomething("+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---");
	}

}
//	 private final static Stack<Character> stack =
//			    new Stack<Character>();
//	private static void evaluate(String expr) {
//			    char data[] = expr.toCharArray();
//			    for(int i = 0; i < data.length;)
//			      switch(data[i++]) {
//			        case '+' : stack.push(data[i++]);
//			                   break;
//			        case '-' : System.out.print(stack.pop());
//			      }
//			  }
//			  public static void main(String[] args) {
//			    evaluate(
//			     "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
//			  }
//			}