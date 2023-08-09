package practice_day05;

public class UcgenHarfTablosu {
    public static void main(String[] args) {
        /*
   A
   A B
   A B C
   A B C D
   A B C D E
   A B C D E F
   şeklini yazdırınız.  65=A'nın ascıı değeri
         */

        int harf = 97;

        for (int satir = 0; satir <10 ; satir++) { // satir sayisini belirledik 0-10 arasi

            for (int sutun = 0; sutun <= satir ; sutun++) { // satir sayisinca sutun olmasini belirledik
                System.out.print((char)(harf+sutun)+" ");

            }
            System.out.println("");

        }
    }
}
