package datastructure;

import model.Product;

public class CartStack {
	
	// Yığının en üstündeki düğümü tutan referans
	private Node top;
	private int size; // Sepetteki toplam ürün sayısı
	
	// Yığın düğümü (Node) iç sınıfı
	private class Node {
		Product data;
		Node next;
		
		public Node(Product data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Constructor
	public CartStack() {
		this.top = null;
		this.size = 0;
	}
	
	// Yığın boş mu kontrolü (isEmpty)
	public boolean isEmpty() {
		return top == null;
	}
	
	// Sepete ürün ekleme (push - LIFO mantığı)[span_2](start_span)[span_2](end_span)
	public void push(Product product) {
		Node newNode = new Node(product);
		newNode.next = top; // Yeni düğüm eski top`ı gösterir
		top = newNode;     // Top artık yeni düğüm olur
		size++;
	}
	
	// Son eklenen ürünü çıkarma / Geri al - Undo (pop)[span_3](start_span)[span_3](end_span)
	public Product pop() {
		if (isEmpty()) {
			System.out.println("Uyarı: Sepet boş, geri alınacak işlem yok!");
		}
		Product poppedProduct = top.data; // En üstteki veriyi al
		top = top.next;                  // Top bir alta kaydırılır
		size--;
		return poppedProduct;
	}
	
	// En üstteki ürünü silmeden inceleme (peek)[span_4](start_span)[span_4](end_span)
	public Product peek() {
		if (isEmpty()) {
			return null;
			
		}
		return top.data;
	}
	
	// Sepeti tamamen boşaltma (clear)[span_5](start_span)[span_5](end_span)
	public void clear() {
		top = null;
		size = 0;
	}
	
	// Sepetteki eleman sayısını döndürme
	public int size() {
		return size;
	}
	

}
