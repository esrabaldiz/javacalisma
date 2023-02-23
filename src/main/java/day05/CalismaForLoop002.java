package day05;

public class CalismaForLoop002 {
    public static void main(String[] args) {
  //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //   A A A A A
        //   A A A A A
        //   A A A A A

    //    for (int i=1 ; i<4 ; i++){
    //        String s="";
    //     for (int k=1  ; k<6 ; k++)  {
    //       s+="A";
    //     }
    //        System.out.println(s);
    //    }
    //    System.out.println();
//Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. A
//   A
//   A A
//   A A A
//   A A A A
        for (int i=1; i<=5;i++){



            for (int k=1; k<i ;k++) {

                System.out.print("A");

            }
            System.out.println();
        }


        System.out.println();
//2.yol
/*
 A A A A
 A A A
 A A
 A
 */


        for (int l=4 ; l>0 ; l--){
            for (int j=l ; j>0 ; j--){
                System.out.print( " A ");
            }
            System.out.println();
        }
    }
}
