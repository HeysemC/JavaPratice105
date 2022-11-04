package day01;

public class Q01_Print {
    public static void main(String[] args) {
        /*
        Konsolda :
        "Hello " \ / 'World'"
        yazdiriniz.
         */

        /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */
        System.out.println("\"Hello \" \\ / 'World'\"" );
        System.out.println('\'');
        /*
        *************************************
        *       "ATM'ye Hosgeldiniz"
        *
        *
        *  1-Bakiye Sorgulama
        *  2-Para Yatirma
        *  3-Para Cekme
        *  4-menu'den cikis
        * *************************************
         */
        System.out.println(
                "************************************" +
                "\n\t\t\"ATM'ye Hosgeldiniz\"" +
                "\n\n\t1-Bakiye Sorgulama" +
                "\n\t2-Para Yatirma" +
                "\n\t3-Para Cekme" +
                "\n\t4-Menu'den cikis" +
                "\n\n***********************************");

// concatenation + ile string ifadeyi bölme
        System.out.println("ali" + "ayse"); // concatenation
        System.out.println(3+7); // matematiksel toplama


        System.out.println("************************************" +
                "\n\t\t\"ATM'ye Hosgeldiniz\"\n\n\t" +
                "1- Bakiye Sorgulama\n\t" +
                "2- Para Yatirma\n\t" +
                "3- Para Cekme\n\t" +
                "4- Menu'den Cikis\n\n" +
                "************************************");

    }

}
