package practice_day05;

public class PalindromicSayi {
    public static void main(String[] args) {
        /*
        palindromic sayi her iki tarafindan da okundugunda ayni degeri
        ifade eden sayidir.
        Ornek: 9009 - 12321 -121
         */


        // 3 Basamaklı sayılarin carpimiyla olusan en buyuk palindromik sayiyi
        // bulan kodu yaziniz.



        int flag = 0; // islem sayisi
        int maxbas1 = 100; // uc basamaklı max 1.sayi
        int maxbas2 = 100; // uc basamakli max 2.sayi
        int maxbas3 = 100; // max1*max2

        for (int i = 1000; i >100 ; i--) {
            for (int j = 1000; j > i ; j--) {
               if (checkpalindromic(i*j)){
                   System.out.println(i+"*"+j+"="+i*j);
                   flag++;
                   if (maxbas3<i*j){ // max sayi < i*j
                       maxbas3=i*j;
                       maxbas1=i;
                       maxbas2= j;

                     //  System.out.println("Max. Pal. Sayi = " + maxbas1+ " * "+ maxbas2+ " ="+maxbas3 );
                   }

               }

            }

        }
        System.out.println(flag); // işlem sayisi
       // System.out.println("Max. Pal. Sayi = " + maxbas1+ " * "+ maxbas2+ " ="+maxbas3 );







    }

    public static  boolean checkpalindromic (int i){

        boolean result = false ;
        int sayi =i;
        int digit1 = sayi%10 ; //0
        sayi /=10;//8888
        int digit2 = sayi%10; //8
        sayi /= 10; //888
        int digit3 = sayi%10 ; //8
        sayi /= 10;//88
        int digit4 = sayi%10;//8
        sayi /= 10;//8
        int digit5 = sayi%10;//8
        sayi/=10;//0
        int digit6 = sayi%10;
        sayi /= 10;
        int digit7 = sayi ;

        if (i<= 1000000){
            if (digit1==digit6 && digit2==digit5 && digit3==digit4){
                result=true;
            }
        }


        return result;
    }
}
