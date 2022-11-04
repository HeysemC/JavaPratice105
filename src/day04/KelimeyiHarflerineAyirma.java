package day04;

import java.util.Arrays;

public class KelimeyiHarflerineAyirma {
    public static void main(String[] args) {
        /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */
        String name="Heysen Musa Yasin";
        kelimeninHarfleriArrayi(name);
        //[H, e, y, s, e, n,  , M, u, s, a,  , Y, a, s, i, n]

    }
    public static void kelimeninHarfleriArrayi (String input){
        char[] outoput=new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            outoput[i]=input.charAt(i);
            
        }
        System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(outoput));
    }
}
