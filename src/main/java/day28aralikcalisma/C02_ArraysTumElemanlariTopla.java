package day28aralikcalisma;

public class C02_ArraysTumElemanlariTopla {
    public static void main(String[] args) {
        //SORU 2: Verilen bir array'in tum elemanlarini toplayan bir program yazin.
        int[] a = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);


    }

}

