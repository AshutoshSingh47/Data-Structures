package stacks;
import java.util.Stack;
public class Input_Output {

	public static void main(String[] args) {

Stack<Integer>stack=new Stack();
int popped;
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
popped=stack.pop();
System.out.println(popped);
int peeked=stack.peek();
System.out.println(peeked);
popped=stack.pop();
System.out.println(popped);
 popped=stack.pop();
System.out.println(popped);
popped=stack.pop();
System.out.println(popped);
popped=stack.pop();
System.out.println(popped);
	}

}
