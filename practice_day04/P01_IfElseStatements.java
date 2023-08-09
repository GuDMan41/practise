package practice_day04;

import java.util.Scanner;

public class P01_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru: kenar degerleri girilen bir ucgenin dik ucgen olup olmadıgını
        kontrol edip donut veren kod dizisini yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol edilcek ucgenin kenarlarının uzunluklarini giriniz : ");
        System.out.print("Birinci kenarin uzunluğunu giriniz: ");
        int a = scan.nextInt();
        System.out.print("İkinci kenarin uzunlugunu giriniz : ");
        int b = scan.nextInt();
        System.out.print("Ucuncu kenarin uzunlugunu giriniz : ");
        int c = scan.nextInt();

        System.out.println("=================== 1.Cozum=======================");

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");

        } else if ((a * a) + (c * c) == (b * b)) {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");


        } else if ((b * b) + (c * c) == (a * a)) {

            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");

        } else {
            System.out.println("Girdiginiz degerlere sahip ücgen bir dik ucgen degildir.");
        }
        System.out.println("=================== 2.Cozum=======================");

        if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {
            // ||: OR (VEYA) isareti ile yazilanlardan sadece birinin dogrulanması yeterlidir.
            // && AND (VE) isareti ile yazilanların tamami dogru olması gerekir
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgendir");
        } else {
            System.out.println("Girdiginiz degerlere sahip ücgen bir dik ucgen degildir.");
        }

        // CI-CD : Continue Integration


    }
}
