package day28aralikcalisma;

import java.util.Arrays;

public class ArraySorusu {
    public static void main(String[] args) {


        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin

        // 1 . yol for loop
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+ " ");//5 6 7 8 9 10

        }
        System.out.println();
        // 2. yol while loop

        int k=5;

        while (k>=10){
            System.out.print(k + " ");
            k++;
        }
        System.out.println();

        int j=5;
        // 3 yol


        do{
            System.out.print(j + " ");
            j++;
        }while (j>=10);



        }


    }

