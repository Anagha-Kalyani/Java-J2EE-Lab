import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> books=new ArrayList<Book>();
		HashMap<Integer,Book> bookmap= new HashMap<>();
		System.out.println("Enter number of books:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("\nBook "+(i+1));
			System.out.println("Enter book id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter title of book:");
			String title=sc.nextLine();
			System.out.println("Enter author of book:");
			String author=sc.nextLine();
			System.out.println("Enter publisher of book:");
			String pub=sc.nextLine();
			System.out.println("Enter price of book:");
			int price=sc.nextInt();
			Book b=new Book(title,author,pub,price);
			books.add(b);
			bookmap.put(id, b);
		}
		
		
		ArrayList<Book> bookprice= new ArrayList<>();
		
		Iterator itr= books.iterator();
		while(itr.hasNext()){
			Book q=(Book) itr.next();
			bookprice.add(q);
			System.out.println();
			System.out.println("Title:"+q.title);
			System.out.println("Author:"+q.author);
			System.out.println("Publisher:"+q.pub);
			System.out.println("Price:"+q.price);
		}
		
		System.out.println("\nThe books mapped to id:");
		for(Map.Entry<Integer,Book> entry:bookmap.entrySet()){
			System.out.println("Book id:"+entry.getKey()+"\t Book title:"+entry.getValue().title);
		}
		
		Collections.sort(bookprice,new PriceSort());
		System.out.println("\nBooks in ascending order of their price:");
		
		Iterator itr1= bookprice.iterator();
		while(itr1.hasNext()){
			Book q=(Book) itr1.next();
			System.out.println("Title:"+q.title+"\t Price:"+q.price);
		}
		
		System.out.println("\nEnter the name of author:");
		String auth=sc.next();
		System.out.println("Books with this author are:");
		for(Book b:books){
			if(b.author.equalsIgnoreCase(auth)){
				System.out.println(b.title);
			}
		}
		
		System.out.println("\nEnter the price:");
		int p=sc.nextInt();
		sc.nextLine();
		ArrayList<Book> books1=new ArrayList<>();
		System.out.println("Books added to the new list are:");
		for(Book b:books){
			if(b.price>p){
				books1.add(b);
				System.out.println(b.title);
			}
		}
		
		System.out.println("\nEnter string to be found in book titles:");
		String x=sc.nextLine();
		System.out.println("The books are:");
		for(Book b:books){
			if(b.title.indexOf(x)!=-1){
				System.out.println(b.title);
			}
		}
		
		System.out.println("\nEnter the name of publisher:");
		String pub1=sc.nextLine();
		System.out.println("Books with this publisher are:");
		for(Book b:books){
			if(b.pub.equalsIgnoreCase(pub1)){
				System.out.println(b.title);
			}
		}
		
		System.out.println("\nEnter title of book to change publisher details:");
		String y=sc.nextLine();
		System.out.println("Enter new publisher name:");
		String z=sc.nextLine();
		for(Book b:books){
			if(b.title.equalsIgnoreCase(y)){
				b.pub=z;
				System.out.println("New details:\n Title: "+b.title+"\t Publisher: "+b.pub);
			}
			
		}
		
	}

}