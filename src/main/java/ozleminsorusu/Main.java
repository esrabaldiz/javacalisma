package ozleminsorusu;

public class Main {
    /*
      Multi dimensional arrayin ic arraylerindeki tum elemanlarin toplamini birer birer bulan ve herbir
     sonucu yeni bir arrayin elemani yapan ve yeni arrayi ekrana yazdiran bir program yaziniz.
      ((1,2,3),(4,5),(6,7))  1+2+3=6 4+5=13
       6+7=13 output (6,9,13)
     */
    public static void main(String[] args) {
        // multi-dimensional array tanımlama
        int[][] array = {{1,2,3},{4,5},{6,7}};

        // yeni array oluşturma

        int[] results = new int[array.length];

        // multi-dimensional arrayin iç arraylerindeki tüm elemanları toplama
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            results[i] = sum;
        }

        // yeni arrayi ekrana yazdırma
        for (int result : results) {
            System.out.println(result);
        }
    }
}
/*
    Bu program multi-dimensional array olarak verilen array'i tarar ve iç arraylerindeki tüm elemanları toplar.
     Bu toplamları results adlı yeni bir array olarak oluşturur ve son olarak results arrayini ekrana yazdırır.

 */

