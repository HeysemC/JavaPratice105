package day05;

public class Q03_SayiyiTersCevirme {
    public static void main(String[] args) {
        /*
         * Interview questions…
         *
         * write a return method to reverse number
         *
         * Input : 12345 Output : 54321
         */
        int input=54321;
        System.out.println("Girdiginiz sayinin ters cevrilmis hali :"
                +reverseNumber(input));
    }

    private static int reverseNumber(int input) {

        int reverseNum=0;
        while (input>0){
            reverseNum = input %10 + reverseNum*10;
            input=input/10;
        }




        return reverseNum ;
    }
}
