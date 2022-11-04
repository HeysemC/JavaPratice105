package day02;

import java.util.Scanner;

public class Q01_Scanner_IfStatements {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         * (Hint 1 sugar = 2.7 gr)
         */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen günlük kaç bardak çay içtiğiniz yazınız : ");
        int cay= new Scanner(System.in).nextInt();

        System.out.print("bir bardak çayda kaç şeker kullanıyorsunuz : ");
        double seker=new Scanner(System.in).nextDouble();

        //kg cinsinden bulmak icin 1000'e bolduk
        double yillikTuketim=(cay*(2.77*seker))*365/1000 ;
       double kirkYillikTuketim=yillikTuketim*40;


        //if icin boolean
          if (seker==0){
              System.out.println("hey human,go on :)");
          }else {
              System.out.println("yıllık "+yillikTuketim+ " kg şeker tüketiyosunuz.\n" +
             "kirk yillik "+kirkYillikTuketim+"kg seker tuketiyorsunuz");
          }
        if (yillikTuketim>=15){
            System.out.println("çok seker tuketiyorsun\n");
        }else {
            System.out.println("seker kullanımın ideal");
        }if (cay>=10){
            System.out.println(" gunluk tuketiminde çayı azalt");
        }else {
            System.out.println("gunluk cay tuketimin ideal");
        }


    }
}
