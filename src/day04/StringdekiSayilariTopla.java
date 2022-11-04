package day04;

public class StringdekiSayilariTopla {
    public static void main(String[] args) {
        /*
         * write a method which accepts a String as parameter
         * and prints the sum of the digits, present in the given string
         *
         * Parametre olarak bir String kabul eden ve verilen Stringde
         * bulunan rakamların toplamını yazdiran bir method yazın.
         *
         * Input : ade1r4d3
         * Output : 1+4+3 = 8
         *
         * Use Character.isDigit()
         *     Integer.valueOf()
         */
        String kelime="ade1r4d3";
        rakamlarinToplami(kelime);

    }
    public static void rakamlarinToplami(String input){
        int toplam=0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                toplam+=Integer.valueOf(""+input.charAt(i));
            }
        }
        System.out.println("Rakamlarin toplami :" + toplam);


    }
}
/*
String[] arr=input.split("");

for (int i = 0; i < input.length(); i++) {
    Character a = input.charAt(i);
    if (Character.isDigit(a)) {
        //top += Integer.valueOf("" + input.charAt(i));
        top += Integer.valueOf(arr[i]);
    }
 */

/*
for (int i = 0; i < input.length(); i++) {
            Character a = input.charAt(i);
            if (Character.isDigit(a)) {
                //top += Integer.valueOf("" + input.charAt(i));
                //top += Integer.valueOf(arr[i]);
                top += Integer.valueOf(input.substring(i, i + 1));
            }
 */