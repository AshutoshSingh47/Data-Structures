package linked_list;
public class Implementation<E> {
Node<E> head;
public void insert(E e){
	Node<E> node=new Node<E>(e);
//	node.data=data;
//	node.next=null;
	
	if(head==null)
	{
		head=node;
	}
	else{
		Node<E> n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
	}
public E get_element() {
	Node<E> temp=head;
	Node<E> to_remove;
	if(temp==null)
	{
		System.out.println("Cannot remove element");
	}
	if(temp.next==null)
	{
		to_remove=head;
		head=null;
		return to_remove.data;
	}
	else
	{
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		to_remove=temp.next;
		temp.next=null;
		return to_remove.data;
	}
		
}
public boolean isEmpty(){
	return head==null;
}
public E get_last(){
	Node<E> temp=head;
	if(temp.next==null)
	{
		temp=head;
		return temp.data;
	}
	else
	{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data;
	}
		
		
}
public void rotate(int k)
{
	Node<E>temp=head;
    Node<E>itr=null;
    if(k==0)
    {
        System.out.println("Invalid Input");
    }
    else{
   for(int i=0;i<k;i++)
    {
       itr=temp;
       temp=temp.next;
       
    }
    itr.next=null;
    itr=temp;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=head;
    head=itr;
        
    }
}
    
public void show(){
	Node<E> node=head;
	while(node!=null){
		System.out.print(node.data+" ");
		node=node.next;
	}
		System.out.println();
}

    
 
}


