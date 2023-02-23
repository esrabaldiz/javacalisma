package ozleminsorusu;

public class IkiciYontem {
    public static void main(String[] args) {

            // multi-dimensional array tanımlama
            int[][] array = {{1,2,3},{4,5},{6,7}};

            // yeni array oluşturma
            int[] results = new int[array.length];

            // multi-dimensional arrayin iç arraylerindeki tüm elemanları toplama
            int i = 0;
            for (int[] innerArray : array) {
                int sum = 0;
                for (int element : innerArray) {
                    sum += element;
                }
                results[i++] = sum;
            }

            // yeni arrayi ekrana yazdırma
            for (int result : results) {
                System.out.println(result);
            }
    }
}
