package doubly_linked_list;

public class Implementation<E> {
	Node<E>head,tail;
	public void insert(E e)
	{
		Node<E> node=new Node<E>(e);
		if(head==null)
		{
			head=tail=node;
		}
		else
		{
			Node<E>n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			node.prev=n;
			tail=node;
		}
	}
	
	public void reverse_display()
	{
		Node<E>n=tail;
		if(tail==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			while(n!=null)
			{
				System.out.print(n.data+" <- ");
				n=n.prev;
			}
		}
	}
	public void reverse()
	{
		
		if(head==null)	
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node<E>previous=head;
			Node<E>current=previous.next;
			Node<E>forward=current.next;
			head.next=null;
			while(forward!=null)
			{
				previous.prev=current;
				current.next=previous;
				previous=current;
				current=forward;
				forward=forward.next;
			}
			previous.prev=current;
			current.next=previous;
			current.prev=null;
			current=head;
			head=tail;
			tail=current;
		}
	}
	public void display()
	{
		Node<E>n=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			while(n!=null)
			{
				System.out.print(n.data+" -> ");
				n=n.next;
			}
		}
	}
}
