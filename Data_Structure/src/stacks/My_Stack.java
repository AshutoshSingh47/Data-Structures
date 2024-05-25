package stacks;

import linked_list.Implementation;

public class My_Stack<E>{
Implementation<E>imp=new Implementation<>();
public void push(E e)
{
	imp.insert(e);
	
}
public E pop() 
{if(imp.isEmpty())
{
	throw new ArrayIndexOutOfBoundsException("Stack is Empty");
}
//	int popped=imp.get_element();
	
	return imp.get_element();
}
public E peek(){
if(imp.isEmpty())
{
	throw new ArrayIndexOutOfBoundsException("Stack is Empty");
}
	return imp.get_last();
}
public void display()
{
	imp.show();
}
}
