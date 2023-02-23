package day28aralikcalisma;

import java.util.ArrayList;
import java.util.List;

public class Listede15Varsa51IleDegistir {
    public static void main(String[] args) {

        /*
            SORU 10:  Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
                      Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
         */

List<Integer> eleman1=new ArrayList<>();
       eleman1.add(12);
       eleman1.add(11);
       eleman1.add(15);
       eleman1.add(34);
       eleman1.add(43);
        System.out.println(eleman1);//[12, 11, 15, 34, 43]
for (int i=0 ; i<eleman1.size();i++){
  if (eleman1.get(i)==15){
    eleman1.set(i,51);

  }

}
        System.out.println(eleman1);//[12, 11, 51, 34, 43]
    }
}
