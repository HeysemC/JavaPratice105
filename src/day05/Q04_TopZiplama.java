package day05;

public class Q04_TopZiplama {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

        double yukseklik = 200;

        topuZipla(yukseklik);
    }

    public static void topuZipla(double yukseklik) {
        double topunToplamYolu = 0;

        int yereVurmaSayisi = 0;

        do {
            yereVurmaSayisi++;
            topunToplamYolu+=yukseklik;
            yukseklik*=0.75;
            topunToplamYolu+=yukseklik;
        }while (yukseklik>=100);
        System.out.println("Topun katettigi toplam yol : "+topunToplamYolu+
                "\nTopun yere vurma sayisi : "+yereVurmaSayisi);
    }
}
