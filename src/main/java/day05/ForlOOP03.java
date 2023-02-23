package day05;

import java.util.Scanner;

public class ForlOOP03 {
    public static void main(String[] args) {
    //    Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
   //    işaretiyle yazdırmak için gereken kodu yazınız.
   //   Örneğin; 75.4238  ́ *4*2*3*8

Scanner input=new Scanner(System.in);
System.out.println("bir sayi giriniz");

double num= input.nextDouble();
String sayi= String.valueOf(num);
int idx=sayi.indexOf(".");
String noktadanSonra=sayi.substring(idx+1);
String bos="";
        for (int  i= 0; i <noktadanSonra.length() ; i++) {
         String ch=noktadanSonra.substring(i, i+1);
         bos=bos+ "*" + ch;
        }
        System.out.println(bos);
        //baska bir ornek
        /*
        System.out.println("bir kelime giriniz");
String word = input.next();
String newWord= "";
int k=0;

 while (k < word.length()) {


     newWord = newWord +word.charAt(k) +"*";


     k++;
 }
 System.out.println(newWord);
         */
    }
}
