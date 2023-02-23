package denemeteam03day03;

import java.util.Scanner;

public class InterwievSorusu {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input=new Scanner(System.in);
/*
        System.out.println("lutfen bir cumle ve bir harf giriniz");

        String cumle=input.nextLine().toLowerCase();

        char ch=input.next().toLowerCase().charAt(0);

        int sayac=0;

        for (int i=0; i<cumle.length();i++){

            if (cumle.charAt(i)==ch){
               sayac++;

            }
        }
        System.out.println(sayac);
        /*
 String cumle = input.nextLine().toLowerCase();
char harf = input.next().toLowerCase().charAt(0);
int sayac = 0;

for (int i = 0; i< cumle.length(); i++){
    if (cumle.charAt(i)== harf){
        sayac++;
    }
}
System.out.println(sayac);
         */
//exemple2:
/*
 Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
 Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
 Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
 */
        /*
        System.out.println("Lutfen bir sifre giriniz...");
        String pws = input.nextLine().trim().replaceAll("\\s+","");

        String tampws = pws.length()>9 ? "Geçerli Parola" : "Geçersiz Parola";

        System.out.println(tampws);

  //exemple3:
   /*
     Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
    a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
 */
        /*
        System.out.println("");
        int a = 5;
        int b = 6;
        int c = 12;

        String hangiUcgen = a ==b && b ==c  ? "Eskenar": (a == b && b != c || b==c && a !=c || a==c && b!=a) ? "Ikizkener":"Cesit kenar";
        System.out.println(hangiUcgen);

        /*
        int a = 5, b = 4, c = 3;
String ucgenTipi = a==b && b==c ? "Eskenar Ucgen" : (a==b && b!=c || a==c && b!=c || b==c && a!=c ? " Ikizkenar Ucgen" : "Cesit Kenar Ucgen");
System.out.println(ucgenTipi);

         */
/*
     Yazdırmak için switch ifadesini kullanınız.
    a) Aralık, Ocak, Şubat için "Kış"
    b) Mart, Nisan, Mayıs için "Bahar"
    c) Haziran, Temmuz, Ağustos için "Yaz"
    d) Eylül, Ekim, Kasım için "Güz"
    e) Diğerleri için "Geçersiz ay adı"


 */
        System.out.println("lutfen bir ay ismi giriniz");

        String ayIsmi=input.next().toLowerCase();

        switch (ayIsmi){
            case "aralik ":
            case "ocak ":
            case "subat ":
                System.out.println("kis mevsimi");
                break;

            case "mart":
            case "nisan":
            case "mayis ":
                System.out.println("ilkbahar");
                break;

            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;

            case "eylul":
            case "ekim":
            case "kasim ":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("lutfen gecerli bir ay ismi griniz");
        }

 //exemple:5
        /*
          myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
     yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
     'A' ve 'a' için "İlk Karakter" yazdırınız.
     'B' ve 'b' için "İkinci Karakter" yazdırınız.
     'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
     'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
        Diğerleri için "Diğer Karakterleri" yazdırınız
         */




    }
}
