package queue;

public class Main {

	public static void main(String[] args) {
My_Queue<Integer> mq=new My_Queue<>();
mq.enqueue(1);
mq.enqueue(2);
mq.enqueue(3);
mq.enqueue(4);
mq.enqueue(5);
System.out.println(mq.dequeue());
System.out.println(mq.dequeue());
System.out.println(mq.dequeue());
System.out.println(mq.dequeue());
System.out.println(mq.dequeue());
System.out.println(mq.dequeue());
mq.enqueue(1);
mq.enqueue(2);
mq.enqueue(3);
mq.enqueue(4);
mq.enqueue(5);
System.out.println(mq.dequeue());
System.out.println(mq.peek());
System.out.println(mq.peek());
System.out.println(mq.dequeue());
System.out.println(mq.peek());
	}

}
