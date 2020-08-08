package stacks;
import java.util.Scanner;
import java.util.Stack;
public class Stack_Intro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int popped,i,j,size,pushed;
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("ENTER SIZE OF STACK");
		size=sc.nextInt();
		System.out.println("ENTER THE NUMBERS IN THE STACK");
		for(i=0;i<size;i++)
		{
			pushed=sc.nextInt();
			stack.push(pushed);
		}
		System.out.println(stack);
		for(j=0;j<size-1;j++)
		{
			popped=stack.pop();
			System.out.print(popped+" ");
		}
		System.out.println();
		popped=stack.peek();
		System.out.println(popped);
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		System.out.println(stack);
//		popped=stack.pop();
//		System.out.print(popped+" ");
//		popped=stack.pop();
//		System.out.print(popped+" ");
//		popped=stack.pop();
//		System.out.print(popped+" ");
//		popped=stack.pop();
//		System.out.print(popped+" ");
		
	}

}
