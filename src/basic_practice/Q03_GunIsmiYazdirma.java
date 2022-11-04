package basic_practice;

import java.util.Locale;
import java.util.Scanner;

public class Q03_GunIsmiYazdirma {
    /*
         Kullanicidan gun numarasini alip
         gun ismini yazdiran bir program yazin
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz : ");

        int gunSayisi = scan.nextInt();

        System.out.println("=================== If Else Cozumu==================");
        if (gunSayisi <= 0 || gunSayisi > 7) {
            System.out.println("Gecersiz giris yaptiniz");
        } else if (gunSayisi == 1) {
            System.out.println("Pazartesi");
        } else if (gunSayisi == 2) {
            System.out.println("sali");
        } else if (gunSayisi == 3) {
            System.out.println("carsamba");
        } else if (gunSayisi == 4) {
            System.out.println("Persembe");
        } else if (gunSayisi == 5) {
            System.out.println("cuma");
        } else if (gunSayisi == 6) {
            System.out.println("cumartesi");
        } else System.out.println("pazar");

        System.out.println("=================== Switch Case Cozumu==================");

        switch (gunSayisi) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz gun sayisi");

        }
        switch (gunSayisi) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz gun sayisi");

        }
    }
}



