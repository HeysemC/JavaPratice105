package day02;

import java.util.Scanner;

public class Q02_Scanner_IfStatements {
    public static void main(String[] args) {
        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u
        //
        Scanner scan=new Scanner(System.in);
        //aynı veri tipleri deger atanmadıysa yan yana yazabiliriz
        double vize, finalNotu, devam;
        System.out.print("Vize notunuzu giriniz : " );
        vize=scan.nextDouble();
        System.out.print("Final notunuzu giriniz : " );
        finalNotu=scan.nextDouble();
        System.out.print("Devam notunuzu giriniz : ");
        devam=scan.nextDouble();

        double ort=(vize*0.1)+(finalNotu*0.8)+(devam*0.1);


        if (ort>100 || ort<0){
            System.out.println("yANLİS GİRİS YAPTİNİZ, Lutfen gecerli degerler giriniz");
            //ort ismini degitirelim sag tık + rename +enter yaparak kullandıgımız tum ort'lari degistirir
        } else if (ort>=70)  {
            System.out.println("ort = " + ort+" tebrikler,caliskan sey");
        } else if (ort>=60)  {
            System.out.println("ort = " + ort+
                    " sartli gectiniz, ortalamaniz, Agno'nuz 1,8'in uzerinde ise gecmis olursunuz");
        }else {
            System.out.println("ort = " + ort+" Bu sefer olmadi, seneye :'(");
        }









        Scanner scan1 = new Scanner(System.in);
        System.out.println("sırayla vize final ve devam not giriniz");
        double vize1 = scan.nextDouble();
        double fnl = scan.nextDouble();
        double devam1 = scan.nextDouble();
        double ortt = vize1 * 0.1 + fnl * 0.8 + devam1 * 0.1;
        if (ortt >= 70) {
            System.out.println("Gectiniz");
        } else if (ortt > 60) {
            System.out.println("sartlı gectiniz");
        }else {
            System.out.println("Kaldınız :(");
        }


    }
}
