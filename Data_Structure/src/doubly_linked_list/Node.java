package doubly_linked_list;

public class Node<E> {
	
Node<E>next,prev;
public E data;
public Node(E data)
{
	this.data=data;
	next=null;
	prev=null;
}
}
