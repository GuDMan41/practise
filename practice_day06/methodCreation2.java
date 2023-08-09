package practice_day06;

import java.util.Scanner;

public class methodCreation2 {
    public static void main(String[] args) {
        /*
    Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
 */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Lütfen soyadinizi giriniz: ");
        String surname = scanner.nextLine();
        System.out.println(isimSoyisimYazdir(name, surname));


    }

    private static String isimSoyisimYazdir(String name, String surname) {

        name = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        surname = surname.toUpperCase().charAt(0) + surname.substring(1).toLowerCase();
        String duzenliIsim = name+" "+surname;

        return duzenliIsim;
    }


}
