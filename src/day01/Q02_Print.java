package day01;

public class Q02_Print {
    public static void main(String[] args) {
        /*
    76453 sayisinin her bir basamagini konsolda alt alta yazdirin.

    input : 76453
    output: 7
            6
            4
            5
            3

     */
        System.out.println("Sayiyi yaziniz");
        int sayi=76453;
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;


        int birler1=sayi%10;
        int onlar1=sayi%100;
        int yuzler1=sayi%1000;
        int binler1=sayi%10000;
        int onbinler1=sayi%100000;

        System.out.println(onbinler+"\n"+binler+
                "\n"+yuzler+
                "\n"+onlar+
                "\n"+birler);
        System.out.println(onbinler1+"\n"+binler1+"\n"+yuzler1+"\n"+onlar1+"\n"+birler1);

        /*
    76453 sayisinin her bir basamagini konsolda alt alta yazdirin.


    input : 76453
    output: 7
            6
            4
            5
            3 */





            int sayi0 = 23618;

            int birler0 = sayi%10;
            int onlar0  = (sayi/10)%10;
            int yuzler0 = (sayi/100)%10;
            int binler0 = (sayi/1000)%10;
            int onbinler0 = (sayi/10000)%10;

            System.out.println(onbinler0 + "\n" + binler0 + "\n" + yuzler0 + "\n" + onlar0 + "\n" + birler0 );
        }
    }

