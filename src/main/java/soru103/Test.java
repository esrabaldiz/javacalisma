package soru103;

public class Test {
    public static void main(String[] args) {

        int x;
        /*insert code here */

        for (x=100; x<=100; x++){
            System.out.println("Welcome " + x); //Welcome 100
        }

        x=100;
        while(x<=100){
            x++;
            System.out.println("Welcome " + x); //Welcome 101
        }

        x=100;
        do {
            ++x;
            System.out.println("Welcome " + x);
        }while(x<100); //Welcome 101
    }

    //oraya ne yazarsak sonuc Welcome 100 verir
    //Cevap B
    }
