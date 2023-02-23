package day15arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C02_Arrays {
    public static void main(String[] args) {
 //bir stringdeki sesli harflerin sayisini bulan kodu yaziniz

        Scanner input =new Scanner(System.in) ;
        System.out.println("lutfen bir cumle giriniz");
        String kelime=input.nextLine().toLowerCase();

       String harfler[] =kelime.split("");//harf harf elde etmek icin splite hiclik koyduk yoksa kelimeleri tek tek verirdi
        System.out.println(Arrays.toString(harfler));
        int counter=0;
        for (String w : harfler) {     //iter yazarsak bize otomatik olarak for_Each loopu olusturur
            switch (w){
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;

        }

        }
        System.out.println(counter);

    }
    }

