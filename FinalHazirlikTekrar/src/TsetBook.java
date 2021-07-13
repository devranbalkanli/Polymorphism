import java.util.Scanner;
public class TsetBook {
	public static void main(String []args) {
		System.out.println("Kitap sayisi:"+Book.getBookNumber());
		Book b1=new Book();
		b1.print();
		System.out.println("Kitap sayisi:"+Book.getBookNumber());
		Book b2=new Book(111,"Kasagi","Omer Seyfettin",20);
		b2.print();
		System.out.println("Kitap sayisi:"+Book.getBookNumber());
		b1.setBook(222,"Nutuk","Atatürk",100);
		b1.print();
		Book b3=createBook();
		b3.print();
		
		if(FiyatCompare(b2,b3)) 
			System.out.println("ilk kitap daha pahali");
			else
				System.out.println("Ýlk kitap daha ucuz");
		
		System.out.println("kitap sayisi:"+Book.getBookNumber());
		
		Roman r1=new Roman(123,"yilanlarin ocu","Fakir Baykurt",35,1);
		r1.print();
		BilimselKitap bk1=new BilimselKitap(525,"how to program java","deitel",60,5);
		bk1.print();
		
		System.out.println("**polymorphism**");
		
		BookStore bs[]=new BookStore[3];
		
		bs[0]=b2;
		bs[1]=r1;
		bs[2]=bk1;
		
		for(int i=0;i<bs.length;i++) {
			bs[i].print();
			System.out.println("Kitap Fiyati:"+bs[i].getFiyat());
			
		}
		
	}
	
	public static Book createBook() {
		int id1;
		String y,i;
		double f;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kitap id gir:");
		id1=scan.nextInt();
		System.out.println("Kitap ismi gir:");
		i=scan.nextLine();
		System.out.println("Kitap icin yazar gir");
		y=scan.nextLine();
		System.out.println("Kitap fiyatý giriniz");
		f=scan.nextDouble();
		return new Book(id1,i,y,f);
		
	}
	public static boolean FiyatCompare(Book bx,Book by) {
		if(bx.getFiyat()>by.getFiyat())
			return true;
		else 
			return false;
	}

}
