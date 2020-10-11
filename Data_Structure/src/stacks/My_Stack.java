package stacks;

import linked_list.Implementation;

public class My_Stack {
Implementation imp=new Implementation();
public void push(int data)
{
	imp.insert(data);
	
}
public int pop() 
{if(imp.isEmpty())
{
	throw new ArrayIndexOutOfBoundsException("Stack is Empty");
}
//	int popped=imp.get_element();
	
	return imp.get_element();
}
public int peek(){
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
