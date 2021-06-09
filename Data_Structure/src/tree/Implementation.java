package tree;

public class Implementation<E> {
Node<E> root;
public void insert(E e)
{
	Node<E> node=new Node<E>(e);
	Node<E>n=root;
	Node<E>temp;
	if(root==null)
	{
		root=node;
	}
	else if(n.left==null)
	{
		n.left=node;
	}
	else {
		n.right=node;
	}
}
	public void display()
	{
		Node<E>n=root;
		System.out.print(n.data+" "+n.left.data+" "+n.right.data);
		
	}

}
