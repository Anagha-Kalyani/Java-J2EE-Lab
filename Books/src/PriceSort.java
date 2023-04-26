import java.util.*;
public class PriceSort implements Comparator<Book>{
	public int compare(Book b1, Book b2){
		if(b1.price<b2.price){
			return -1;
		}
		else if(b1.price==b2.price){
			return 0;
		}
		else{
			return 1;
		}
	}
}