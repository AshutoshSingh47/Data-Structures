package stacks;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		My_Stack<Integer>stack =new My_Stack<>();
		int popped,peeked,size;size=0;
		System.out.println("Enter size");
		size=sc.nextInt();
		System.out.println("Enter element in the stack");
//		for(int i=0;i<size;i++)
//		{   int element=sc.nextInt();
//			stack.push(element);
//		}
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
		stack.display();
		
	}

}
