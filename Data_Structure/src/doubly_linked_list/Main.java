package doubly_linked_list;

public class Main {

	public static void main(String[] args) {
		Implementation<Integer>implied=new Implementation<Integer>();
		implied.insert(1);
		implied.insert(2);
		implied.insert(3);
		implied.insert(4);
		implied.display();
		System.out.println();
		implied.reverse_display();
		implied.reverse();
		System.out.println();
		implied.display();
		System.out.println();
		implied.reverse_display();
		implied.rotate(3);
		System.out.println();
		implied.display();

	}

}
