package oca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
   int nums[]={1,2,3};
   int nums2[]={1,2,3,4,5};
   nums2=nums;
   for (int x: nums2){
       System.out.println(x+  ":");
   }
   String [] arr= {"hi","how","are","you"};
        List<String> arrList=new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrList);
        if (arrList.removeIf(s-> {
            System.out.print(s);
            return  s.length()<=2;} )){
            System.out.println("removed");
        }

    }
}
