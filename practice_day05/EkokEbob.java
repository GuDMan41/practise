package practice_day05;

import java.util.Scanner;

public class EkokEbob {

    public static void main(String[] args) {

    // Kullanıcıdan 2 tamsayı alın ve EBOB
    // (En Büyük Ortak Bölen) ve EKOK(En Küçük Ortak Kat)
    // değerlerini bulun


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif iki tamsayi giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int flag = 0;

        System.out.println("Girdiginiz sayilarin sırasıyla: " + num1+"-"+ num2);
        // Once EBOB hesaplamasi yapalim
        // ilk olarak kucuk sayiyi ebob degiskenine atıyoruz.
        // 30 ve 40 icin ebob'u ilk olarak 30 atadık.
        int limitEbob=0;

        if (num1<num2){
            limitEbob = num1;
        } else {
            limitEbob = num2;
        }

        // atanan limitEbob degerini birer azaltarak en buyuk ortak boleni buluyoruz.
        // 30 degerinden baslayıp 1'er azaltarak ikisini de bolebilecek en buyuk sayiyi ariyoruz.
        for (int i = limitEbob; i >=2 ; i--) {

            if (num1%i == 0 && num2%i==0){
                System.out.println("Bu sayilarin EBOB degeri: "+i);
                flag ++;
                break;
            }
        }
        // flag degerinin gic armamasi ortak bolen bulamadıgı anlamına gelir.
        if (flag==0){
            System.out.println("Bu iki sayinin ortak boleni yoktur");
        }
        // Girilen sayilarin EKOK'unu bulalım
        flag=0;
        // for loop yazarken 1'den baslayip bir limit koyarak i degerini  1'er
        // arttırarak ilerleyecegiz

     //   System.out.println("Lütfen Ekok degeri olabilecek maksimum limiti giriniz:");
     //   int limit = scan.nextInt();
        for (int i = 1; i <(num1*num2) ; i++) {
            if (i%num1 == 0 && i%num2==0){

                System.out.println("Girdiginiz sayilarin en kucuk ortak kati : "+ i);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girdiginiz sayilarin belirttiginiz limit degerinden kucuk bir sayi EKOK degeri yoktur");

        }


    }
}
