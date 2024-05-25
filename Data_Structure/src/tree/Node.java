package tree;

public class Node<E> {

	public Node<E>left;
	public Node<E>right;
	public E data;
	public Node(E data)
	{
		this.data=data;
		left=right=null;
	}

}
