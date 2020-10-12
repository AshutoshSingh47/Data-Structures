package queue;

import linked_list.Implementation;

public class My_Queue {
	Implementation imp=new Implementation();
	public void offer(int data)
	{
	imp.insert(data);
	}
	public int poll()
	{
		return imp.get_element();
	}
	public static void main(String[] args) {
		My_Queue mp=new My_Queue();
	mp.offer(1);
	mp.offer(2);
	mp.offer(3);
	mp.offer(4);
	mp.offer(5);
	System.out.println(mp.poll());
	System.out.println(mp.poll());
	System.out.println(mp.poll());
	System.out.println(mp.poll());
	System.out.println(mp.poll());
	}

}
