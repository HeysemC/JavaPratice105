package basic_practice;

import java.util.Scanner;

public class Q2_HidingNameAndNumber {
    public static void main(String[] args) {
        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren't 16 digit
         * print "Invalid credit card number"
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         *
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lutfen 16 haneli kart numaranızı giriniz");
        String ccn=scan.nextLine();

        if (ccn.length()!=16) System.out.println("Invalid credit card number");

        else {
            isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
            soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
            ccn="**** **** ****" + ccn.substring(12);

            System.out.println("Name : "+isim +" " + soyisim + "\nCCN : " + ccn);
        }


    }
}
