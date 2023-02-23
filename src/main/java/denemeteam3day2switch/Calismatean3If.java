package denemeteam3day2switch;

import java.util.Scanner;

public class Calismatean3If {
    public static void main(String[] args) {

          /*
            EXAMPLE 1: Verilen yilin "Artik Yil (Leap Year) olup olmadigini kontrol eden kodu yaziniz.

                        1) Yil 100'e bolunurse 400'e bolunmelidir. ==> 1600 ==> Leap 1800 ==> Leap degil
                        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. ==> 2004 ==> Leap   2005 ==> Leap degil
         */

        int year = 2024;
        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Artik yildir");
        } else System.out.println("Artik yil degildir");

//Ternary ile

        String leapYearMi = (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) ? "Artik yildir" : "Artik yil degildir";
        System.out.println(leapYearMi);

//Suleyman hocanin cozumu
        int year2 = 1600;

        String result = year % 100 == 0 ? (year % 400 == 0) ? "Leap" : "Not Leap" : (year % 4 == 0 ? "Leap" : "Not Leap");
        System.out.println(result);
//---------------------------------------------------------------------------------------------------------------------

        /*
            EXAMPLE 2:
            Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
         */
//---------------------------------------------------------------------------------------------------------------------

        // EXAMPLE 3:
        // Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        // Sayi negatifse -1 ile carpilir  -4 ==> -1 * 4     4 ==> 4   0 ==> 0

//---------------------------------------------------------------------------------------------------------------------

        // EXAMPLE 4
        // Iki sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

//---------------------------------------------------------------------------------------------------------------------

        // EXAMPLE 5:
        // 40'den 23'e kadar tum cift tamsayilari yazdiran kodu yaziniz.

//---------------------------------------------------------------------------------------------------------------------

        /*
            EXAMPLE 6:
            Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan karakterlerini buyuk harf yapiniz.
            Yazdiginiz kod belli seneryolar icin calisiyor tum senaryolar icin calismiyorsa bu koda "Hard Code" denir.
            Hard code yanlis yazilmis koddur. Mutlaka duzeltilmelidir.
            Bir String'de son index = length()-1

         */
        String s = "ankara";
        String t = " ";
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1).toUpperCase();
            if (i % 2 == 0) {


//---------------------------------------------------------------------------------------------------------------------
            /*
           EXAMPLE 7:
           Ay numarasini soyleyince numarasi verilen ay'dan baslayip
           12. aya kadar tum aylarin isimlerini yazdiran kodu yaziniz
           8 ==> August - September - October - November - December
             */
               Scanner scan=new Scanner(System.in);
                System.out.println("lutfen bir ay numarasi giriniz");
                int ayIsmi= scan.nextInt();
                switch (ayIsmi){
                    case 1:
                        System.out.println("ocak");
                    case 2:
                        System.out.println("subat");
                    case 3:
                        System.out.println("mart");
                    case 4:
                        System.out.println("nisan");
                    case 5:
                        System.out.println("mayis");
                    case 6:
                        System.out.println("haziran");
                    case 7:
                        System.out.println("temmuz");
                    case 8:
                        System.out.println("agustos");
                    case 9:
                        System.out.println("eylul");
                    case 10:
                        System.out.println("ekim");
                    case 11:
                        System.out.println("kasim");
                    case 12:
                        System.out.println("aralik");
                }

//---------------------------------------------------------------------------------------------------------------------


       /*
        EXAMPLE 8:
        Kullanicidan iki sayi ve yapilacak islemi alan ve toplama,
        cikarma, bolme, carpma ve % islemlerini yapan kodu yaziniz.

        */
                System.out.println("lutfen iki sayi giriniz");
                double sayi1= scan.nextDouble();
                double sayi2= scan.nextDouble();
                System.out.println("toplam islemi icin 1'e , cikarma islemi icin 2 'ye , bolme islemi icin 3 'e ,carpma islemi icin4'e,yuzde islemi icin 5 'e basiniz");
byte islem=scan.nextByte();
switch (islem){

    case 1 :
        System.out.println(sayi1+sayi2);
        break;
    case 2 :
        System.out.println(sayi1-sayi2);
        break;
    case 3 :
        System.out.println(sayi1/sayi2);
        break;
    case 4 :
        System.out.println(sayi1*sayi2);
        break;
    case 5 :
        System.out.println(sayi1*sayi2/100);
        break;
    default:
        System.out.println("gecerli bir islem giriniz");
}
//---------------------------------------------------------------------------------------------------------------------

          /*
          EXAMPLE9:
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz

         */
                System.out.println("ulke adi giriniz");
                String ulkeAdi=scan.next();

                switch (ulkeAdi.toLowerCase()){
                    case "america":

                        System.out.println("US");
                        break;
                    case "england":

                        System.out.println("UK");
                        break;
                    case "germany":
                        System.out.println("DE");
                        break;
                    case "turkey":
                        System.out.println("TR");
                        break;
                    default:
                        System.out.println("gecerli bir ulke adi giriniz");
                }






            }




      







    }
}
}
