package day28aralikcalisma;

import java.util.Scanner;

public class ForIleSekilYapma {
    public static void main(String[] args) {
         /*
            SORU 8:  Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                        A
                        A A
                        A A A
                        A A A A
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir karakter  giriniz :");//
      char ch=scan.next().charAt(0);
      for (int i=1 ; i<5 ; i++){
      for (int j= 1 ;j<=i ;j++){
       System.out.print(ch +" ");
          }
          System.out.println();
      }
//2.sekil sorusu
        for (int i = 5; i >0 ; i--) {
        for (int k = i; k >1 ; k--) {
         System.out.print(ch+" ");

            }
            System.out.println();}
    }
}
