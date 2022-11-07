package day06;

public class Q03_Arrays {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.
        float[] sayilar={1.0f,2.0f,3.0f,4.0F,5.0F};
        float toplam=0;
        System.out.println("*********************** FOR COZUMU ***************************");
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        System.out.println(toplam);
        System.out.println("************************ WHİLE COZUMU 1 *************************");
        toplam=0;
        int index= sayilar.length-1;
        while (index>=0){
            toplam+=sayilar[index];
            index--;
        }
        System.out.println("Toplam : "+toplam);
        System.out.println("************************ WHİLE COZUMU 2 *************************");
        toplam=0;
        index=0;
        while (index< sayilar.length){
            toplam+=sayilar[index];
            index++;
        }
        System.out.println("Toplam : "+toplam);
        System.out.println("************************ D0-WHİLE COZUMU *************************");

        toplam=0;
        index=0;
        do {
            toplam+=sayilar[index];
            index++;
        }while (index< sayilar.length);//<=sayilar.length-1
        System.out.println("Toplam" + toplam);

    }
}
