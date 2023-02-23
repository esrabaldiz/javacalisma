package denemeteam03;

import java.util.Scanner;

public class Team03day01 {
    public static void main(String[] args) {
      //  dikdortgenAlaniHesapla(15,12);
          /* EXAMPLE 8:

    Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
        - 0-4 arasi "Bebek"
            - 5-12 arasi "Cocuk"
            - 13-20 arasi "Genc"
            - 21-30 arasi "Yetiskin
    Tanimlanmamis Evre
    Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
        */
        Scanner input = new Scanner(System.in);
        // System.out.println("lutfen bir yas giriniz");
        //   int yas=input.nextInt();

        //  switch (yas){
        //     case 0 -5:
        //          System.out.println("bebek");
        //         break;
        //  case "yas < 5 && yas >0":
        //      System.out.println("");
        //      break;
        //  case "yas<13":
        //      System.out.println("cocuk");
        //      break;
        //  case "yas<21":
        //      System.out.println("genc");
        //      break;
        //  case "yas<31":
        //      System.out.println("yetiskin");
        //      break;
        //  default:
        //   System.out.println("lutfen gecerli bir yas araligi giriniz");



            /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */
   //     System.out.println("lutfen bir gun ismi giriniz");
       // String gunIsmi = input.next().toLowerCase();
/*
        if (gunIsmi.equals("cuma")) {

            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gunIsmi.equals("cumartesi")) {

            System.out.println("yahudiler icin kutsal gun");
        } else if (gunIsmi.equals("pazar")) {

            System.out.println("Hristiyanlar icin kutsal gun");

        } else System.out.println("gecerli br gun ismi giriniz");

   /*
        EXAMPLE 10:

        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi = scan.nextInt();
        int sayi2 = input.nextInt();

        System.out.println("bir islem seciniz");
        char ch = scan.next().charAt(0);
        if (ch == '+') {
            System.out.println(sayi + sayi2);

        } else if (ch == '-') {
            System.out.println(sayi - sayi2);

        }
        if (ch == '*') {
            System.out.println(sayi * sayi2);
        }
        if (ch == '/') {
            System.out.println(sayi / sayi2);
        } else System.out.println("lutfen gecerli bir islem giriniz");

      //  ********************
         /*                 ********* if Else Statement *******


    EXAMPLE 11:

    Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
    kare olup olmadigini yazdiriniz
     */



 //   public static int dikdortgenAlaniHesapla(int a,int b){
//return a*b;

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lutfen kisa kenari giriniz");
        int kisaKenar = Math.abs(scan3.nextInt());

        System.out.println("Lutfen uzun kenari giriniz");
        int uzunKenar = Math.abs(scan3.nextInt());

        if (kisaKenar == uzunKenar) {
            System.out.println("Bu bir karedir");
        } else
            System.out.println("Bu bir dikdortgendir");
      //  2.yol
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen iki kenar uzunlugu giriniz");

        double kenar1 = Math.abs(input1.nextDouble());
        double kenar2 = Math.abs(input1.nextDouble());




        if(kenar1<=0 || kenar2<=0 ){
            System.out.println("karenin kenarlari sifir veya negatif olamaz");

        }else if(kenar2==kenar1 ){
            System.out.println("bu bir karedir");
        }else {
            System.out.println("bu bir kare degildir");
        }
    }

}
