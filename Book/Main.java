import java.util.Map;
import java.util.HashMap;

public class Main{
	public static void main(String[] args){
		Map<String, Book> collection = new HashMap<String, Book>();

		Book objectBook = new Book("Benhur", 1980);

		collection.put("Pekka", objectBook);
		collection.put("Fahad", new Book("Wrestling Tough", 1990));

		for(String str: collection.keySet()){
			System.out.println( str + " " + collection.get(str));
		}
	}
}