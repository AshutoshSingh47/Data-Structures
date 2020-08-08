package stacks;
import java.util.Scanner;
import java.util.Stack;
public class Stack_Functions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int popped,i,j,size,pushed;
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("ENTER SIZE OF STACK");
		size=sc.nextInt();
		System.out.println("ENTER THE NUMBERS IN THE STACK");
		for(i=1;i<=size;i++)
		{
			pushed=sc.nextInt();
			stack.push(pushed);
		}
		System.out.println(stack);
//		popped=stack.peek();
//		System.out.println(popped);
//		popped=stack.pop();
//		popped=stack.pop();
//		System.out.println(popped);
		int find=stack.search(3);
		System.out.println(find);
		for(j=1;j<=size;j++)
		{popped=stack.pop();
		System.out.print(popped+" ");}
		
		boolean check=false;
	    check=stack.empty();
		System.out.println("\n"+check);
	}

}
