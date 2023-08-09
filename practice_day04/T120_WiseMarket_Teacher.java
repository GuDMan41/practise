package practice_day04;

import java.util.Scanner;

public class T120_WiseMarket_Teacher {
    /*
     Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince giş yazdıran bir program
     hazırlayın
      ==================== WISE MARKET KASA PROGRAMI ===================================
    ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 ŞARKÜTERİ ÜRÜNLERİ
      2 MANAV ÜRÜNLERİ
      3 MARKET ÜRÜNLERİ
      secime gore ,
      4-urunleri listele ve
      5-fiyatlari gelsin
      Variable'ları belirleyelim
      urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam
    */
    static Scanner scan=new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;  //double: ondalıklı sayı için kullanılır
    static double urunMiktari;
    static int urunKodu;     //int : tam sayı değerleri için kullanılır.
    static String sepet="";
    static double toplam;

    public static void main(String[] args) {
        girisEkrani();

    }

    public static void girisEkrani() {
        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=================    Hoşgeldiniz     =================");
        System.out.println("-----------------       Menü         -----------------");
        System.out.println("   Lütfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz  ");
        System.out.println("1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış");

        int secim= scan.nextInt();
        if((secim<1 || secim>5)) { //if(!(secim>=1 && secim<=5))
            System.out.println(" Uyarı: Geçersiz bir tuşa bastınız. Tekrar Giriniz ");
            girisEkrani();
        }else{
            switch (secim){
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }

    }
    public static void sarkuteri() {
        System.out.println("Şarkteri Reyonuna Hoşgeldiniz");girisEkrani();
    }
    public static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");girisEkrani();
    }

    public static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz");girisEkrani();
    }
    public static void fisYazdir() {
        System.out.println("Alışveriş Fişi");girisEkrani();
    }
    public static void cikis() {
        System.out.println("Çıkış Ekrani");
    }





}