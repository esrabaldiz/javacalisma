package lambdatekrar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        aynisatirdaYaz(nums);
        System.out.println();
        ciftElemanYazdir(nums);
        System.out.println();
        kareleriniBul(nums);
        System.out.println();
        kupleriniBul(nums);
        System.out.println();
        toplamiBul(nums);
        System.out.println();
        karelerininCarpimBul(nums);
        System.out.println();
        maxValuBul(nums);
        System.out.println();
        minValuBul(nums);
        System.out.println();
        getMinValue3(nums);
    }
    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Lambda ile -functional)

    public static void aynisatirdaYaz(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));//12 9 131 14 9 10 4 12 15
    }

    //2)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(functional)
    public static void ciftElemanYazdir(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));//12 14 10 4 12
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void kareleriniBul(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));//81 17161 81 225

    }
    //4)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void kupleriniBul(List<Integer> nums) {
        nums.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));//729 2248091 3375

    }
//5)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    //cift elemanlarin karelerinin toplamini bulan methodu yaziniz
public static void toplamiBul(List<Integer> nums) {
//reduce : indirgeme demektir.
//kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
//bir sonraki elemanla işlemle tutulur
       Integer sum=nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
    System.out.println(sum);//456
}
//6)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    //cift elemanlarin karelerinin carpimini bulan method olusturun
public static void karelerininCarpimBul(List<Integer> nums) {
    Integer carpim = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
    System.out.print(carpim);//45158400
}
    //7)Create a method to find the "maximum value" from the list elements
    public static void maxValuBul(List<Integer> nums) {
    Integer max=    nums.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.print(max);//131
    }
    //10)Create a method to find the minimum value from the list elements
    public static void minValuBul(List<Integer> nums) {//1.yol
       Integer min=nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.print(min);//4
    }
    public static void getMinValue3(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.print(min);//4
    }
    }














