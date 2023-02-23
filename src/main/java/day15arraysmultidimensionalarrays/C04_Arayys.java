package day15arraysmultidimensionalarrays;

public class C04_Arayys {
    public static void main(String[] args) {
        //bir arrayín icinde herhangi bir elemanin  olup olmadigini ve kac kere tekrarlandigini
        // kontrol eden kodu yaziniz
        int arr[]={5,1,5-3};
        int eleman =5;
        int sayac = 0;
        for (int w : arr) {
            if (w==eleman){
                sayac++;
            }//if
        }//for
        if (sayac>0){
            System.out.println(eleman +"arrayde"+sayac+"defa var");
        }else
            System.out.println(eleman +"array`de yok");
    }
}
