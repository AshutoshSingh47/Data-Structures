package linked_list;

public class Node<E> {

	//public static void main(String[] args) {
		public Node<E> next;
		public E data;
		public Node(E data)
		{
			this.data=data;
			next=null;
		}
	}


