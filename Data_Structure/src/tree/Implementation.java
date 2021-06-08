package tree;

public class Implementation<E> {
Node<E> root;
public void insert(E e)
{
	Node<E> node=new Node<E>(e);
	Node<E>n=root;
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
	

}
