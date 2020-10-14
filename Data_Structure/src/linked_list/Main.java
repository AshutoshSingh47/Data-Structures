package linked_list;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Implementation<Integer>implied=new Implementation<>();
		int i,j,size;
//		implied.insert(18);
//		implied.insert(20);
//		implied.insert(22);
//		implied.insert(24);
//		implied.insert(26);
		System.out.println("Enter the size of linked list");
		size=sc.nextInt();
		for(i=0;i<size;i++)
		{
			j=sc.nextInt();
			implied.insert(j);
		}
		implied.show();
	}

}
