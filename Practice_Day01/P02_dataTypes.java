package Practice_Day01;

public class P02_dataTypes {
    public static void main(String[] args) {

        /*
        byte: Sadece tam sayi deger ifade eder - hafızada 8 bit yer kaplar
        short: Sadece tam sayi deger ifade eder - hafızada 16 bit yer kaplar
        int:   Sadece tam sayi deger ifade eder - hafızada 32 bit yer kaplar ( En cok kullanılan )
        long:  Sadece tam sayi deger ifade eder - hafızada 64 bit yer kaplar
        float : Ondalıklı sayıları ifade eder ( Sonunda F,f yazmak zorunludur)
        double: Ondalıklı sayıları ifade eder ( Sonunda d yazmak zorunlu degil)
        byte<short<int<long<float<double
        boolean : true ya da false
        char : tek tırnak içinde yazılır tek karakter alır-ascii tırnak icine yazılmaz
         */

        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;

        System.out.println("Byte Max. Değer  = " + b1);
        System.out.println("Byte Min. Değer  = " + b2);
        short s1 = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("Short Max. Değer  = " + s1);
        System.out.println("Short Min. Değer  = " + s2);
        // Ctrl + Alt + L : Kodlarda düzenleme yapar
        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        System.out.println("Integer Max. Değer = " + i1);
        System.out.println("Integer Min. Değer = " + i2);
        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;
        System.out.println("Long Max. Değer = " + l1);
        System.out.println("Long Min. Değer = " + l2);
        float f1 = Float.MAX_VALUE;
        float f2 = Float.MIN_VALUE;
        System.out.println("Float Max. Değer = " + f1);
        System.out.println("Float Min. Değer = " + f2);
        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        System.out.println("Double Max. Değer = " + d1);
        System.out.println("Double Min. Değer = " + d2);
        // Double Min. Değer = 4.9E-324 4.9 * 10 üzeri - 324 demek
        // Double Max. Değer = 1.7976931348623157E308 E308 (10 üzeri 308 demek)

        /*
        nonPrimitive data türleri çok fazladır
        String şu anda sadece bildiğimiz
        özellikleri Karakter sınırı yoktur.
         */

        String isim = "Kaan Yakuphanoğullarından";
        char giris = 'm';
        System.out.println("isim = " + isim);
        System.out.println("giris = " + giris);
        System.out.println(isim.charAt(3)); // ==> a


    }
}
