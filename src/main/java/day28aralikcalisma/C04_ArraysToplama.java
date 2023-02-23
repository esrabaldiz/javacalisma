package day28aralikcalisma;

public class C04_ArraysToplama {
    public static void main(String[] args) {
     /*
            SORU 4: Asagidaki multi demensional array'in ic array'lerindeki son elemanlarin carpimini
                    ekrana yazdiran bir program yazin
                    {{1,2,3},{4,5},{6}}
         */
        // Bu kodda, 'arr' değişkeni verilen çok boyutlu dizi için tanımlanmıştır.
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

        int sonuc = 1;

// Çok boyutlu dizi içinde dönüyoruz ve her bir alt dizinin son elemanını bulmak için bir döngü oluşturuyoruz.
        for (int[] w: arr) {
            sonuc *= w[w.length - 1];
        }

// Sonucu ekrana yazdırıyoruz
        System.out.println(sonuc);

    }
}
