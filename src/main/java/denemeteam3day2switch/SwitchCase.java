package denemeteam3day2switch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
            EXAMPLE 2:
            Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
         */
        Scanner input=new Scanner(System.in);
  //    System.out.println("lutfen bir gun ismi giriniz");
  //       String jour =input.next();

  //    switch (jour.toLowerCase()){
  //        case "lundi":
  //            System.out.println(1);
  //            break;
  //        case "mardi":
  //            System.out.println(2);
  //            break;
  //        case "mecredi":
  //            System.out.println(3);
  //            break;
  //        case "jeudi":
  //            System.out.println(4);
  //            break;
  //        case "vendredi":
  //            System.out.println(5);
  //            break;
  //        case "samedi":
  //            System.out.println(6);
  //            break;
  //        case "dimanche":
  //            System.out.println(7);
  //            break;
  //        default:
  //            System.out.println("lutfen gecerli bir gun ismi giriniz");

  //    }
  //    System.out.println();
  //    // EXAMPLE 3:
  //    // Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
  //    // Sayi negatifse -1 ile carpilir  -4 ==> -1 * 4     4 ==> 4   0 ==> 0
  //    System.out.println("lutfen bir sayi giriniz");
  //    int number= input.nextInt();

  //        System.out.println(number<0 ? -1*number : number);
  //    System.out.println();
  //    // EXAMPLE 4
  //    // Iki sayinin isareti ayni ise bu sayilari carpan,
  //    // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

  //    int m = 5;
  //    int n = 6;

  //    Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "Farkli isaretli sayilari carpamiyorum";
  //    System.out.println(r3); // 30
  //    System.out.println();
  //    // EXAMPLE 5:
  //    // 40'den 23'e kadar tum cift tamsayilari yazdiran kodu yaziniz.

        for (int i=40;i>22 ; i--){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }



    }
}
