package day28aralikcalisma;

import java.util.Arrays;

public class ArraydeOrtadakiSayiyiBul {
    public static void main(String[] args) {
 /*
            SORU 9: Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                    Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
                           (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */
int[] arr={12,5,8,10,11};//5,8,10,11,12
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int uzunluk = arr.length;

       int otadakiIndex = (uzunluk- 1) / 2;
       int ortadakiEleman=arr[otadakiIndex];
       //eleman sayisi cift olan array'lerin ortadaki elemanlarinin indexini bulmak icin yaptik
       int  index1=uzunluk/2-1;

       int index2=uzunluk/2;

       //ortadaki elemalari almak icin
        int eleman1=arr[index1];

    int eleman2=arr[index2];

    //ortalamsini bulmak icin
if (uzunluk%2!=0){
    System.out.println(ortadakiEleman);
}else
    System.out.println((eleman1+eleman2)/2);



    }
}
