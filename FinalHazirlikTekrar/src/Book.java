
public class Book extends BookStore{
	protected int id;
	protected String isim,yazar;
	protected double fiyat;
	private static int Book_Number=0;
	
	public Book() {
		id=0;   isim="iiii";   yazar="yyyy"; fiyat=0;
		Book_Number++;
	}
	
	public Book(int id,String isim,String yazar,double fiyat) {
		this.id=id;
		this.isim=isim;
		this.yazar=yazar;
		this.fiyat=fiyat;
		Book_Number++;
	}
	
	public void setBook(int id,String isim,String yazar,double fiyat) {
		this.id=id;
		this.isim=isim;
		this.yazar=yazar;
		this.fiyat=fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat=fiyat;
	}
	public double getFiyat() {
		return this.fiyat;
	}
	public void print() {
		System.out.println("id:"+this.id+"isim:"+this.isim+"yazar:"+this.yazar+"fiyat:"+this.fiyat);
	}
	public static int getBookNumber() {
		return Book_Number;
	}
	

}
