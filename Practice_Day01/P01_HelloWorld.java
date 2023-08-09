package Practice_Day01;

public class P01_HelloWorld {
    public static void main(String[] args) {

        // System.out.println("Merhaba Java");

        // System.out.println("Hello World"); // println fonksiyonu verilen String ifadeyi yazdırıp bir alt satıra gecer
        // System.out.print("yazdirma fonksiyonu-"); // print fonksiyonu verilen String ifadeyi yazdırır ve alt satıra gecmez
        // System.out.println("merhaba");

        //Soru : Konsola " Hello Java Ben Geldim " yazdırın

        System.out.println("\"Hello Java Ben Geldim \"");

        /*
        \"       : bu bize " isareti yazdırır
        \'       : Tek tırnak isareti yazdırır
        \n or \r : Kendinden sonra gelen metni bir alt satırdan baslatır.
        \t       : Kendinden sonra bir TAB bosluk bosluk bırakır
         */
        System.out.println("\'Hello Wise\'");
        System.out.println();
        System.out.println("Hello Wise\nHave a nice day!");
        System.out.println("Hello Java\rSen neymişsin be abi!");
        System.out.println();
        System.out.println("Hello Wise\t\t\t\tHello Future");
        System.err.println("babayigit hoca");
        System.err.println();

        // ALT isaretine basılı tutup mouse ile yukarı kaydırıp basına herhangi bir sey yazabilriiz.

        /* Soru -2 : Konsola
        Değer atayarak
        Ramazan TANHAN - Software Development Engineer in TEST
         */
        String s1 = "Ramazan";
        String s2 = " ";
        String s3 = "TANHAN";
        String s4 = "Software";
        String s5 = "Development";
        String s6 = "Engineer";
        String s7 = "in";
        String s8 = "TEST";
        String s9 = "-";
        String nameSoyisim = "Ramazan TANHAN";
        String job = " - Software Development Engineer in TEST";

        System.out.println(s1 + s2 + s3 + s2 + s9 + s2 + s4 + s2 + s5 + s2 + s6 + s2 + s7 + s2 + s8);
        System.out.println(nameSoyisim + job);

        /* ÖDEV SORUSU:
        Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayınız.
        **********  WISE BANK   **********
                WISE ATM'YE HOŞGELDİNİZ
                1 – Bakiye Sorgulama
                2 – Para Yatırma
                3 – Para Çekme
                4 – Bilgi Güncelleme
                5 – Kart İade
         **********  WISE BANK   **********
                           */

        // SDLC - Software Development Life Cycle ( Yazılım Geliştirme Yaşam Döngüsü)
        // STLC - Software Test Life Cycle ( Yazılım Test Yaşam Döngüsü)


        // Ekranda bir bölümün fotosunu almak
        // Windows: Windows tuşu + shift + S
        // Mac : Cmd+Shift+4

        System.out.println("**********  WISE BANK   **********");
        System.out.println("      WISE ATM'YE HOŞGELDİNİZ                    \n      1 – Bakiye Sorgulama");

        System.out.println("      2 – Para Yatırma");
        System.out.println("      3 – Para Çekme");
        System.out.println("      4 – Bilgi Güncelleme");
        System.out.println("      5 – Kart İade");
        System.out.println("**********  WISE BANK   **********");


    }
}
