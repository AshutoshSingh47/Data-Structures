package array_list;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;
public class Array_List_Bubble_Sort {
	public static void main(String[] args) {
		int i,j,temp;
		List<Integer>list= Arrays.asList(1,2,4,6,5,3);
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.print(list);
	}

}
