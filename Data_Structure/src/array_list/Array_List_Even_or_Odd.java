package array_list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Array_List_Even_or_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   List<Integer>list=new ArrayList<Integer>();
		   int i,j,n;
		   System.out.println("Enter the size of array list");
		   n=sc.nextInt();
		   for(i=0;i<n;i++)
		   {
			   j=sc.nextInt();
			   list.add(j);
		   }
		   System.out.println(list);
		   Iterator itr=list.iterator();
		   while(itr.hasNext())
		   {i=(Integer)itr.next();
			  if(i%2!=0)
				  itr.remove();
		   }
		   System.out.println(list);
		 
		  

	}

}
