package day28aralikcalisma;

import java.util.Scanner;

public class ArraydeOrtadakiElemaniBulma {
    public static void main(String[] args) {
 /*
            SORU 9: Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                    Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
                           (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */

 int[] sayi=   {12, 5, 8,13};


int ortancaSayi= sayi.length/2;
        System.out.println(sayi[ortancaSayi]);


    }
}
