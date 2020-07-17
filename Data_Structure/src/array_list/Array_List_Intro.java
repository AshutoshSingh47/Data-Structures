package array_list;
import java.util.*;
public class Array_List_Intro {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
		System.out.println(list);	
	}
}
