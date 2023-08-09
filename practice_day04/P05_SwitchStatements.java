package practice_day04;

import java.util.Locale;
import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan o gun hangi gun oldugunu girmesini isteyip
        // Haftanın kacıncı gunu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun: ");
        String gun = scan.next();
        gun = gun.toLowerCase();

        switch (gun){

            case "pazartesi" : // switch case durumda eger case sayi ise direk yazilir,case String (metin) ise "" arasinda yazilir
                System.out.println(gun+" haftanin 1. gunudur");
                break;
            case "salı" :
                System.out.println(gun+" haftanin 2. gunudur");
                break;
            case "çarsamba":
                System.out.println(gun+" haftanin 3. gunudur");
                break;
            case "perşembe":
                System.out.println(gun+" haftanin 4. gunudur");
                break;
            case "cuma":
                System.out.println(gun+" haftanin 5. gunudur");
                break;
            case "cumartesi":
                System.out.println(gun+" haftanin 6. gunudur");
                break;
            case "pazar":
                System.out.println(gun+" haftanin 7. gunudur");
                break;
            default:
                System.out.println("Yanlis gun girdiniz");
        }








    }
}
