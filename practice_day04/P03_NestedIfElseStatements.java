package practice_day04;

import java.util.Scanner;

public class P03_NestedIfElseStatements {
    public static void main(String[] args) {
         /*
        Kenar degerleri verilen ucgenin ikizkenar ucgen olup olmadıgını
        kontrol edip donut veren kod dizisini yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz ucgenin kenar degerlerini giriniz ");
        System.out.print("Kenar-1: ");
        double kenar1 = scan.nextDouble();
        System.out.print("Kenar-2: ");
        double kenar2= scan.nextDouble();
        System.out.print("Kenar-3: ");
        double kenar3 = scan.nextDouble();

        if (kenar1>0 && kenar2>0 && kenar3>0){
            if (kenar1==kenar2||kenar1==kenar3||kenar2==kenar3){
                System.out.println("Girdiginiz degerler bir ikizkenar ucgene aittir");
            } else {
                System.out.println("Girdiginiz degerlere sahip ucgen bir ikizkenar ucgen degildir");
            }
        } else {
            System.out.println("Yanlis giris yaptınız");

        }




    }
}
