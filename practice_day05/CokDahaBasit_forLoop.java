package practice_day05;

import java.util.Scanner;

public class CokDahaBasit_forLoop {

    /*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */


    public static void main(String[] args) {

        Scanner wise = new Scanner(System.in);
        System.out.println("Başlangıc degerini giriniz: ");
        int basDegeri = wise.nextInt();
        System.out.println("Bitis degerini giriniz: ");
        int bitDegeri = wise.nextInt();

        int toplam = 0 ;

        if ( basDegeri>bitDegeri){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        } else {
            for (int i = basDegeri; i <=bitDegeri ; i++) {

                toplam += i ;

            }

            System.out.println("Baslangic ve bitis degeri (sinirlar dahil) aralarindaki sayilarin toplami :" +toplam);
        }





    }
}
