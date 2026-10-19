

public class UrunAgaci {



    class Dugum {

        Urun urun;
        Dugum sol;
        Dugum sag;


        public Dugum(Urun urun){

            this.urun=urun;
            sol=null;
            sag=null;

        }

    }

Dugum kok;

    public UrunAgaci(){

        kok=null;

    }

// TODO

    public void urunEkle(Urun yeniUrun){


        kok = ekleYardimci(kok, yeniUrun);
        System.out.println("veritabanina eklendi : "+ yeniUrun.ad + "(ID: " + yeniUrun.id+")");


    }

    private Dugum ekleYardimci (Dugum mevcutDugum, Urun yeniUrun){
        if (mevcutDugum == null) {
            return new  Dugum(yeniUrun);
        }

        if(yeniUrun.id<mevcutDugum.urun.id){

            mevcutDugum.sol =ekleYardimci(mevcutDugum.sol, yeniUrun);
        }

        else if(yeniUrun.id>mevcutDugum.urun.id){
            mevcutDugum.sag= ekleYardimci(mevcutDugum.sag, yeniUrun);
        }

        else{

            System.out.println("uyarı:" +yeniUrun.id + "ID numaralı ürün sistemde zaten var, tekrar eklenemez!");
        }

        return mevcutDugum;
    }




// TODO

    public Urun urunAra(int arananId){

        return null;
    }



}
