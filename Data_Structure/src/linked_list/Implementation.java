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
public void show(){
	Node node=head;
	while(node.next!=null){
		System.out.print(node.data+" ");
		node=node.next;
	}
		System.out.println(node.data);
}
}

