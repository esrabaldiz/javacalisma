package day05;

public class CalismaSoru1 {
    public static void main(String[] args) {
      //  Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //  Örnek; 223878  ́ 37
 int    sayi=223878;

String s= String.valueOf(sayi);

String counter="";
for (int i=0 ; i<s.length() ; i++){
   String rakam=s.substring(i, i+1);
    if (s.indexOf(rakam) ==s.lastIndexOf(rakam)){
        counter+=rakam;
    }
}
        System.out.println(counter);

    }
}
