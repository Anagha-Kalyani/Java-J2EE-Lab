import java.util.*;
public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static ArrayList<Contact> c=new ArrayList<>();
	public static ArrayList<Contact> m=new ArrayList<>();
	
	public static void addMissedCall() {
		System.out.println("Enter the phone number:");
		int w=sc.nextInt();
		m.add(new Contact("",w));
		for(Contact q:m) {
			for(Contact z:c) {
				if(q.phno==z.phno) {
					q.name=z.name;
					break;
				}
				else {
					q.name="Private caller";
				}
			}
		}
		System.out.println("Missed call added.");
	}
	
	public static void display(ArrayList<Contact> list) {
		for(Contact x:list) {
			System.out.println("Name: "+x.name+"\t Phno:"+x.phno);
		}
	}
	
	public static void delContact() {
		System.out.println("Enter the phone number:");
		int q=sc.nextInt();
		int f=0;
		for(Contact x:c) {
			if(q==x.phno) {
				f=1;
				c.remove(x);
				System.out.println("Contact deleted.");
				break;
			}
		}
		if (f==0) {
			System.out.println("Contact not found.");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c.add(new Contact("Alice",3210));
		c.add(new Contact("Barney",3211));
		c.add(new Contact("Charlie",3212));
		c.add(new Contact("Dylan",3213));
		System.out.println("Menu:");
		System.out.println("1. Add missed call\n2. Display contacts\n3. Display missed calls\n4.Delete contact");
		int f=1;
		while(f==1) {
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				addMissedCall();
				break;
			case 2:
				display(c);
				break;
			case 3:
				display(m);
				break;
			case 4:
				delContact();
				break;
			case 5:
				f=0;
				break;
			}
		}
	}

}
