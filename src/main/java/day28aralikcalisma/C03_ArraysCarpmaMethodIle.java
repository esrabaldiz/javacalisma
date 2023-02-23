package day28aralikcalisma;

public class C03_ArraysCarpmaMethodIle {
    public static void main(String[] args) {
        /*
        SORU 3: Asagidaki multi demensional array'in tum elemanlarinin carpimini ekrana yazdiran bir method yazin
                {{1,2,3},{4,5,6}}*/
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int sonuc = arrayTumElemanlariniCarp(arr);

        System.out.println(sonuc);
    }


    public static int arrayTumElemanlariniCarp(int[][] arr) {

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];
            }

        }
        return carpim;
    }
}