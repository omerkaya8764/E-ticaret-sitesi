import javax.swing.*;
import java.awt.*;


public class GirisEkrani extends JFrame {


    UrunAgaci agac = new UrunAgaci();

    UrunLinkedList sepet = new UrunLinkedList();
    GeriAlma islemGecmisi = new GeriAlma();

    public GirisEkrani() {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ignored) {} // modern SWİNG THEME



        agac.urunEkle(new Urun(105, "Laptop", "Elektronik", 30000, 10));
        agac.urunEkle(new Urun(102, "Klavye", "Aksesuar", 1500, 25));
        agac.urunEkle(new Urun(108, "Mouse", "Aksesuar", 800, 30));


        setTitle("E-Ticaret demo");
        setSize(540, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(new Color(241, 245, 249));  // SWİNG MODERNİZE
        Font butonFont = new Font("Segoe UI", Font.BOLD, 12); // SWİNG MODERNİZE

        JTextField txtId = new JTextField(10);
        JButton btnAra = new JButton("Ağaçta Ara");
        JButton btnKatolog =new  JButton("Tüm Kataloğu Listele");
        JButton btnEkle = new JButton("Sepete Ekle");
        JButton btnSepet = new JButton("Sepeti Göster");
        JButton btnGeriAl = new JButton("Son Ekleneni Geri Al");
        JTextArea ekran = new JTextArea(12, 32);
        btnAra.setBackground(new Color(37, 99, 235));
        btnAra.setForeground(Color.WHITE);
        btnAra.setFont(butonFont);

        btnEkle.setBackground(new Color(234, 88, 12));
        btnEkle.setForeground(Color.WHITE);
        btnEkle.setFont(butonFont);
                                                                       // SWİNG GÖRSEL TEMASI İÇİN YAPAY ZEKADAN ALINAN RENKLER VE PARAMETRELER
        btnGeriAl.setBackground(new Color(220, 38, 38));
        btnGeriAl.setForeground(Color.WHITE);
        btnGeriAl.setFont(butonFont);

        btnKatolog.setBackground(new Color(71, 85, 105));
        btnKatolog.setForeground(Color.WHITE);
        btnKatolog.setFont(butonFont);

        btnSepet.setBackground(new Color(71, 85, 105));
        btnSepet.setForeground(Color.WHITE);
        btnSepet.setFont(butonFont);

        ekran.setBackground(new Color(15, 23, 42));
        ekran.setForeground(new Color(226, 232, 240));
        ekran.setFont(new Font("Consolas", Font.PLAIN, 13));





        add(new JLabel("Ürün ID (102, 105, 108):"));
        add(txtId);
        add(btnAra);
        add(btnKatolog);
        add(btnEkle);
        add(btnSepet);
        add(btnGeriAl);
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
                islemGecmisi.push(u);
                ekran.append("Sepete eklendi : " + u.ad + "\n");

            }
        });
btnGeriAl.addActionListener(e -> {


    Urun geriAlinan = islemGecmisi.pop();
    if(geriAlinan != null){

        ekran.append("Geri alındı:" + geriAlinan.ad + "\n");

    }

    else {
        ekran.append("Geri alınacak ürün yok ! \n");
    }
});

btnKatolog.addActionListener(e-> {

ekran.append ("---KATOLOG---\n");

});
btnSepet.addActionListener(e -> {

    ekran.append("---SEPET---\n");
});


    }

    public static void main(String[] args) {

        new GirisEkrani().setVisible(true);
    }
}
