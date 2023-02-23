package bakkalsorusu;

import java.util.Scanner;

public class BakkalProjesi {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */
        double[] haftalikOrtlamaKazanBul = {25, 30, 45, 55, 85, 96, 100 / 2};

        int[] kazanclar = new int[7];
        //kullanicidan kazanclari almak icin
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + " . gunun kazancini giriniz");
            kazanclar[i] = input.nextInt();
        }
        //kazanclari goster
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + ". gun kazanci : " + kazanclar[i]);
        }


    }
}