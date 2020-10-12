package linked_list;

public class Implementation {
Node head;
public void insert(int data){
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null)
	{
		head=node;
	}
	else{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
	}
public int get_element() {
	Node temp=head;
	Node to_remove;
	if(temp==null)
	{
		System.out.println("List is Empty");
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
public int get_last(){
	Node temp=head;
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
public void show(){
	Node node=head;
	while(node.next!=null){
		System.out.print(node.data+" ");
		node=node.next;
	}
		System.out.println(node.data);
}
}

