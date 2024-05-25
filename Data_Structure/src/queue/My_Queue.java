package queue;

import linked_list.Node;

public class My_Queue<E> {
private Node<E> head,rear;
public void enqueue(E e)
{Node<E> node=new Node(e);
	if(head==null)
	{
		head=rear=node;
		return;
	}
	
	rear.next=node;
	rear=rear.next;
}
public E dequeue()
{
	if(head==null)
	{
		return null;
	}
	Node<E> temp=head;
	head=head.next;
	if(head==null)
	{
		rear=null;
	}
	return temp.data;
}
public E peek()
{Node<E> temp=head;
	if(head==null)
	{
		return null;
	}
	else
	{
		return temp.data;
	}
	
}
}
