package day03;

import java.util.Scanner;

public class DogumGunuKiyaslama {
    public static void main(String[] args) {
        /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1.dogum tarini giriniz(exp:yyyy/mm/dd)");//Ahmet
        int yil1=scan.nextInt(),ay1=scan.nextInt(),gun1=scan.nextInt();
        System.out.println("Lutfen 2.dogum tarini giriniz(exp:yyyy/mm/dd)");
        int yil2=scan.nextInt(),ay2=scan.nextInt(),gun2=scan.nextInt();//Ayse
        if(yil1>yil2){
            System.out.println("Ayse Ahmet'ten buyuktur");
        }else if(yil2>yil1){
            System.out.println("Ahmet Ayse'den buyuktur");
        }else{ //bu satıra geldiginizde yillar esittir,bu durumda aylara bakmak icin yeni if blogu olusturulur
            if(ay1>ay2){
                System.out.println("Ayse Ahmet'ten buyuktur");
            }else if(ay2>ay1){
                System.out.println("Ahmet Ayse'den buyuktur");
            }else{//bu satıra geldiginizde aylar esittir,bu durumda gunlere bakmak icin yeni if blogu olusturulur
                if(gun1>gun2){
                    System.out.println("Ayse Ahmet'ten buyuktur");
                }else if(gun2>gun1){
                    System.out.println("Ahmet Ayse'den buyuktur");
                }else{
                    System.out.println("Ayni tarihte dogudunuz");
                }
            }
        }
        //***********************2.cozum0*************************
        int ahmetDogumGunu=yil1*10000+ay1*100+gun1;
        int ayseDogumGunu=yil2*10000+ay2*100+gun2;
        if(ahmetDogumGunu>ayseDogumGunu){
            System.out.println("Ayse buyuktur");
        }else if(ayseDogumGunu>ahmetDogumGunu) {
            System.out.println("Ahmet buyuktur");
        }else{
            System.out.println("Ayni tarihte dogdunuz");
        }
    }
}
