import javax.swing.*;
import java.awt.*;


public class GirisEskrani extends JFrame {


UrunAgaci agac = new UrunAgaci();

UrunLinkedList sepet  = new UrunLinkedList();

public GirisEskrani {

agac.urunEkle(new Urun(105, "Laptop" , "Elektronik" 30000, 10));
agac.urunEkle(new Urun (102 , "Klavye", "Aksesuar", 1500, 25));
agac.urunEkle(new Urun(108, "Mouse", "Aksesuar",  800, 30));


setTitle("E-Ticaret demo");
setSize(450, 350);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(new FlowLayout());


JTextField txtId= new JPasswordField(10);
JButton btnAra= new JButton("Ağaçta Ara");
JButton btnEkle = new JButton ("Sepete Ekle");
JTextArea ekran = new JTextArea(12,25);

add(new JLabel("Ürün ID (1*3, 105, 108):"));
add(txtId);
add(btnAra);
add(btnEkle);
add(new JScrollPane(ekran));

btnAra.addActionListener(e -> {

    int id = Integer.parseInt(txtId.getText());

    Urun u = agac.urunAra(id);

    if (u != null) {
        ekran.append("Bulundu:" + u.ad + "-" + u.fiyat + "TL\n");
    } else {
        ekran.append("Ürün bulunamadı !");

    }
});

btnEkle.addActionListener(e -> {

    int id = Integer.parseInt(txtId.getText());
    Urun u = agac.urunAra(id);


    if (u != null) {

        sepet.addLast(u);
        ekran.append("Sepete eklendi : " + u.ad + "\n");

    }
});


}
public static void main (String[] args) {

    new GirisEkrani().setVisible(true);
}
}