package basic_practice;

import java.util.Scanner;



public class Q04_KelimeninOrtasiniYazdirma {
    public static void main(String[] args) {
        /*
        Tek sayida harf iceren bir String degiskenin ortasindaki harfi
        konsolda yazdirmak icin bir Java programi yaziniz.
        Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdiran method create ediniz.
       ORNEK:
       INPUT : PYTHON
       OUTPUT : th
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String input=scan.next();

        System.out.println(ortadakiHarfiYazdir(input));
    }

    public static String ortadakiHarfiYazdir(String input) {
        int uzunluk = input.length();
        int ortadakiIndex = uzunluk / 2;
        int baslangicDegeri = ortadakiIndex - 1;
        int bitisIndex = ortadakiIndex + 1;

        if (uzunluk == 0) {
            System.out.println("Girilen format uygun deigildir!");
        }else if ((uzunluk & 2) == 0) {
            return input.substring(baslangicDegeri, bitisIndex);
        } else return input.substring(ortadakiIndex, ortadakiIndex + 1);


        return input;
    }
}
