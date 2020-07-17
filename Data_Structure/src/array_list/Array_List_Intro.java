package array_list;
import java.util.*;
//import java.util.LinkedList;
public class Array_List_Intro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("enter the array");
		while(sc.hasNext()){
			int i=sc.nextInt();
			list.add(i);
		}
		/*list.add(1);
		list.add(2);
		list.add(3);    
		list.add(4);*/
		System.out.println(list);	
	}
}
