package day28aralikcalisma;

import java.util.Arrays;
import java.util.List;

public class C01Arrays {
    public static void main(String[] args) {

        /*
            SORU 1: Verilen 3 elemanli bir array'in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
                    ORNEK ==> array[1,2,3} ise
                    output [2,3,1}
         */

        int[] arr={1,2,3};

       int gecici=arr[0];

       for (int i=0 ; i< arr.length-1 ; i++){

     arr[i]=arr[i+1];
       }
       arr[arr.length-1]=gecici;
        System.out.println(Arrays.toString(arr));//[2,3,1]


            }
        }

