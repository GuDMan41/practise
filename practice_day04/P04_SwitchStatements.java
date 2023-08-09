package practice_day04;

import java.util.Scanner;

public class P04_SwitchStatements {
    public static void main(String[] args) {

        // Kullanican dogdugu ayin numarasını isteyip hangi ay dogdugunu yazdiran
        //kod dizisini yaziniz.

        System.out.println("Lutfen dogdugunuz dogum tarihinizin ay hanesindeki sayiyi yaziniz  ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month){
            case 1 :
                System.out.println("Ocak ayında dogmussunuz");
                break;
            case 2 :
                System.out.println("Subat ayında dogmussunuz");
                break;
            case 3:
                System.out.println("Mart ayında dogmussunuz");
                break;
            case 4:
                System.out.println("Nisan ayında dogmussunuz");
                break;
            case 5:
                System.out.println("Mayıs ayında dogmussunuz");
                break;
            case 6:
                System.out.println("Haziran ayında dogmussunuz");
                break;
            case 7:
                System.out.println("Temmuz ayında dogmussunuz");
                break;
            case 8:
                System.out.println("Agustos ayında dogmussunuz");
                break;
            case 9:
                System.out.println("Eylül ayında dogmussunuz");
                break;
            case 10:
                System.out.println("Ekim ayında dogmussunuz");
                break;
            case 11:
                System.out.println("Kasım ayında dogmussunuz");
                break;
            case 12:
                System.out.println("Aralık ayında dogmussunuz");
                break;

            default:
                System.out.println(month+" olarak girdigiiz sayida bir ay yoktur, Yanlis sayı girdiniz");



        }





















    }
}
