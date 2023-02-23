package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //[0,2,3,0,12,0]sifirlari sona atiniz//  interwiev sorusu
  int original[]= {0,2,3,0,12,0};
  int yeni[]=new int[original.length];//integer'larda null degil 0 atar default olarak

    int idx=0;
        for (int i =0 ; i<original.length ; i++){  //original array icin calisti
   if (original[i] !=0) {
       yeni[idx]=original[i];
       idx++;  //bir sonraki indexe gecer

   }
        }
        System.out.println(Arrays.toString(yeni));
    }
}
