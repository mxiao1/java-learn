package test11;

import java.util.LinkedList;
import java.util.Queue;

class Command{
	private String string;
	Command(String string){ this.string=string; }
	public String operation() { System.out.println(string);return string;}
}
class CommandQueue{
	Queue<Command> queue = new LinkedList<Command>();
	Command fill(Command command) {
		queue.offer(command);
		return queue.peek();
	}
}
public class test11_27 {
	public static void main(String[] args) {
		CommandQueue cm = new CommandQueue();
		for (int i=0;i<3;i++) {
			cm.fill(new Command("xiao"));
			cm.fill(new Command("qing"));
			cm.fill(new Command("guang"));
		}
		for(int i=0;i<3;i++) {
			cm.queue.remove().operation();
		}
	}

}
