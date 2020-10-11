package queue;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_Intro {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>();
q.offer(1);
q.offer(2);
q.offer(3);
q.offer(4);
System.out.println(q.poll());
System.out.println(q.poll());
System.out.println(q.poll());
System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q.poll());
		
	}

}
