package practice_day06;

import java.util.Scanner;

public class methodCreation {
    public static void main(String[] args) {
        /*
    Kullanicidan main method icinde pozitif bir tamsayi alin.
    Girilen sayinin asal sayi
    olup olmadigini kontrol edip,
    sonuc olarak "asal sayi" veya "asal sayi degil"
    sonuclarini donduren bir method olusturun.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz:");
        int sayi = scanner.nextInt();
        System.out.println(asalSayiKontrol(sayi));




    }

    private static String asalSayiKontrol(int sayi) {

        String sonuc = "sayi asal sayidir";

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc="sayi Asal sayi degildir";
            }

        }

        return sonuc;





    }

}
