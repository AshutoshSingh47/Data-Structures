package stacks;

public class Main {

	public static void main(String[] args) {
		My_Stack stack =new My_Stack();
		int popped,peeked;
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.display();
		popped=stack.pop();
		System.out.println("Popped Element = "+popped);
		peeked=stack.peek();
		System.out.println("The peeked element is : "+peeked);
		popped=stack.pop();
		System.out.println("Popped Element = "+popped);
		popped=stack.pop();
		System.out.println("Popped Element = "+popped);
		popped=stack.pop();
		System.out.println("Popped Element = "+popped);
		
	}

}
