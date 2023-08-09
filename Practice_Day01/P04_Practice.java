package Practice_Day01;

import java.util.Scanner;

public class P04_Practice {
    public static void main(String[] args) {

   /*
           ====================WISE MARKET===================================

           *ilk programa girildiginde bizi bir menu karsilasin bu secenekler
                 1 ŞARKÜTERİ ÜRÜNLERİ
                 2 MANAV ÜRÜNLERİ
                 3 MARKET
                 secime gore ,
                 4-urunleri listele ve
                 5-fiyatlari gelsin

    */


        System.out.println("====================WISE MARKET===================================" +
                "\n            1 ŞARKÜTERİ ÜRÜNLERİ" +
                "\n            2 MANAV ÜRÜNLERİ" +
                "\n            3 MARKET");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen girmek istediginiz menü numarasini giriniz : ");
        int menuNo  = scanner.nextInt();


        if (menuNo==3){
            System.out.println( "            4-Urunleri listele " +
                                "\n            5-Fiyatlar");
            System.out.println("Lütfen girmek istediginiz menü numarasını giriniz : ");
            int altMenu = scanner.nextInt();
            if (altMenu==4){
                System.out.println( "            1-Elma " +" \n            2-Armut" + "\n            3-Portakal");

            }

        }





















    }
}
