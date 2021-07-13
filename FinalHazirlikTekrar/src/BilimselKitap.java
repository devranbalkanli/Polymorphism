
public class BilimselKitap extends Book {
	private int tur;
	
	public BilimselKitap(int id,String isim,String yazar,double fiyat,int tur) {
		super(id,isim,yazar,fiyat);
		this.tur=tur;
	}
	public void print() {
		System.out.println("id:"+this.id+"isim:"+this.id+"yazar:"+this.yazar+"fiyat:"+this.fiyat+"tur:"+this.tur);
	}
	public double getFiyat() {
		return this.fiyat;
	}

}
