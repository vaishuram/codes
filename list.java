
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {

	public static void main(String[] args) {
	

		        List<String> books = new ArrayList<>();
		        books.add("Deepika");
		        books.add("Dinesh");
		        books.add("Jimmy dog");

		        System.out.println("Original order of List: " + books);

		        Collections.reverse(books);

		        System.out.println("The reversed List: " + books);


		        List<String> output = reverseListRecursively(books);
		        System.out.println("Reversed list reversed again: " + output);
		    }

		    private static List<String> reverseListRecursively(List<String> list) {
		        if (list.size() <= 1) {
		            return list;
		        }

		        List<String> reversed = new ArrayList<>();
		        reversed.add(list.get(list.size() - 1)); // last element
		        reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1)));
		        return reversed;
		   


		

	}
}
