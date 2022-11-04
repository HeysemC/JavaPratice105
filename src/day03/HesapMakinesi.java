package day03;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectirecegimniz
        dört islemden biri ile isleme koyup sonucu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1=scan.nextInt(),sayi2=scan.nextInt();


        System.out.println("Yapma istediginiz islemi seciniz : " +
                "\n\t1. Toplama\n\t2. Cikartma\n\t3. Carpma\n\t4. Bolme");
        int islem=scan.nextInt();
        //char islem1=scan.next().charAt(0); kullanicidan char alma yolu

        if (islem==1) {
            System.out.println("Girdiginiz sayilarin toplami = " + (sayi1 + sayi2));

        }else if (islem==2) {System.out.println("Girdiginiz sayilarin farki = "+(sayi1-sayi2));

        } else if (islem==3) {
            System.out.println("Girdiginiz sayilarin carpimi = "+(sayi1*sayi2));

        } else if (islem==4) {
            System.out.println("Girdiginiz sayilarin bolunu = "+(sayi1/sayi2));

        }else {
            System.out.println("Hatali giris yaptiniz");
        }





    }

}

/*
System.out.println("************\nHesap Makinesi\n"+"--------------\n" +
        "Toplama işlemi için +'ya basınız\n"+
        "Cıkarma(eksiltme) işlemi için -'ye basınız\n"+
        "Bolme işlemi için /'ye basınız\n"+
        "Çarpma işlemi için *'ya\n"+
        "\t\t\t\t\tBeta Version 1.0\n"+
        "********************************");
Scanner scan= new Scanner(System.in);

System.out.println("lütfen ilk sayıyı girin");
double sayi1= scan.nextDouble();
System.out.println("lütfen ikinci yayı girin");
double sayi2= scan.nextDouble();
System.out.println("lütfen yapmak istediğiniz işlemi seçin");
char islem= scan.next().charAt(0);
double sonuc=0;

if( islem=='+') {
    System.out.println("toplama işlemi yaptınız. Sonuc :" + (sayi1+sayi2));
    sonuc= sayi1+sayi2;
}else if(islem=='-'){
    System.out.println("çıkarma işlemi yaptınız. Sonuc :" + (sayi1-sayi2));
    sonuc= sayi1+sayi2;
}else if(islem=='/'){
    System.out.println("Bölme işlemi yaptınız. Sonuc :" + (sayi1/sayi2));
    sonuc= sayi1+sayi2;
}else if(islem=='*'){System.out.println("Çarpma işlemi yaptınız. Sonuc :" + (sayi1*sayi2));
    sonuc= sayi1+sayi2;
}
else {
    System.out.println("hatalı işlem");
 */