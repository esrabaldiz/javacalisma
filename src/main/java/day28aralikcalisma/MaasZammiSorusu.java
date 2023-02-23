package day28aralikcalisma;

import java.util.ArrayList;
import java.util.List;

public class MaasZammiSorusu {
    public static void main(String[] args) {
         /*
            SORU 4: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
         */

        List<Double> maas=new ArrayList<>();
        maas.add(25.3500);
        maas.add(15.000);
        maas.add(35.600);
        maas.add(45.500);
        System.out.println(maas);//[25.35, 15.0, 35.6, 45.5]
        int sum=0;

        for (Double w:maas){
            maas.set(sum,w*1.80);
            sum++;
        }
        System.out.println(maas);//[45.63, 27.0, 64.08, 81.9]
        //2.yol

        for (int i=0 ; i<maas.size() ;i++){
            maas.set(i,maas.get(i)*1.80);

        }
        System.out.println(maas); //[82.134, 48.6, 115.344, 147.42000000000002]
    }
}
