package array_list;
import java.util.*;
public class Array_List_Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   List<Integer>list=new ArrayList<Integer>();
	   int i,j,n,s;s=0;
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
	   {
		   i=(Integer)itr.next();
		   s=s+i;
	   }
	   System.out.println(s);
	
	}

}
