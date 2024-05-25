package array_list;
import java.util.*;
public class Array_List_Intro {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s;
		List<Integer> list=new LinkedList<Integer>();
			System.out.println("Enter Elements");
		for(int i=0;i<5;i++){
            s=sc.nextInt();
            list.add(s);
          }
		System.out.println(list);	
	}
}
