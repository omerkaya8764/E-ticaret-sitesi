public class Main {


    public static void main(String[] args) {


        System.out.println("E- Ticaret Sitesi Veri Yapıları Projesi startinggg..");

        // veri tabanı oolarak kullanacağımız ağacı diriltme bölgesi
        UrunAgaci veritabani = new UrunAgaci();

        Urun u1 = new Urun(105, "Laptop", "Elektronik", 40000.0, 10);
        Urun u2 = new Urun(102, "Tablet", "Elektronik", 25000.0, 50);
// ağac yapısı için tablet ve laptop örnekleri girildi

        //  bu ağaç metodları kodlandıkça ürünler burada oluşacak test edilecek
        // örnek olaraık Urun u1 = new Urun (105, "Laptop", "Elektronik", 25.600, 10)
        // ÜST KISIMDA ÜRÜNLERİN GENEL ÖZELLİĞİ YANİ YAPISI GÖSTERİLMİŞTİR
        // HER ÜRÜN UNİQUE BİR İD YE SAHİP OLACAK VE EKSTRA URUN CLASSINDA YER ALAN ÖZELLİKLERE SAHİP OLACAK

        veritabani.urunEkle(u1);
        veritabani.urunEkle(u2);

//
    }

}