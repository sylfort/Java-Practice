import java.util.LinkedList;
import java.util.Collections;
import java.lang.Comparable;

class Book implements Comparable<Book>{
	String title;
	String author;
	int price;
	
	Book(String t, String a, int p){
		title = t;
		author = a;
		price = p;
	}
	
	public int compareTo (Book b){
		//ascending order
//		return this.price - b.price;
		
		//sort list by the 3rd character in the title field
		return this.title.toLowerCase().charAt(2) - b.title.toLowerCase().charAt(2);
	}
}


public class Practice5_4 {

	public static void main(String[] args) {
		Book book1 = new Book("The Hobbit", "JRRT", 24);
		Book book2 = new Book("A Song of Ice and Fire", "GRRM", 29);
		Book book3 = new Book("Foundations", "Isaac Asimov", 19);
		
		LinkedList<Book> list = new LinkedList<>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		Collections.sort(list);
		
		for (Book book : list) {
//			System.out.println(book.title.charAt(2));
			System.out.println("Author: " + book.author + " Book: " + book.title + " Price: " + book.price);
		}

	}

}
