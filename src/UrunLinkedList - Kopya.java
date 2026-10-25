
public class UrunLinkedList {

private class Dugum {
	Urun urun;
	Dugum next;
	
	public Dugum (Urun urun) {
		this.urun=urun;
		this.next=null;
		
}
}	

private Dugum head;

//urun listenin basina eklenir
public void addFirst(Urun urun) {
	Dugum yeni=new Dugum(urun);
	yeni.next=head;
	head=yeni;
}

//urun sona eklenir
public void addLast (Urun urun) {
	Dugum yeni= new Dugum(urun);
	
} 





}
