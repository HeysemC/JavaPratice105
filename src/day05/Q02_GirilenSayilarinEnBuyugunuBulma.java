package day05;

import java.util.Scanner;

public class Q02_GirilenSayilarinEnBuyugunuBulma {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz,
        // bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfeb 5 adet sayi giriniz : ");

        int enBuyukSayi=0;
        int sayac=0;

        while (sayac<5){

            int sayi=scan.nextInt();

            if (sayi>enBuyukSayi){
                enBuyukSayi = sayi ;
            }
        sayac++;
        }
        System.out.println("Girilen sayilarin en buyugu : "
                +enBuyukSayi );
    }
}