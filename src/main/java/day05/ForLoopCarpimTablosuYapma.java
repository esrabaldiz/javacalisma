package day05;

import java.util.Scanner;

public class ForLoopCarpimTablosuYapma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();

       for (int i =1 ; i<11 ; i++ ){
      System.out.println( sayi + " * " + +i+ " = " + (sayi * i));

  }





    }
}
