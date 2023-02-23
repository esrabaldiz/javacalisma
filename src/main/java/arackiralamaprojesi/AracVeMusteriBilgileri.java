package arackiralamaprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AracVeMusteriBilgileri extends  AracIsteme {
    static List<AracIsteme> aracTalepListesi = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int kiralanacakGunSayisi;


    public static void aracTalepEt() {
        System.out.println("Lutfen araci alacaginiz sehri yaziniz");
        String alinacakSehir = scanner.nextLine();

        System.out.println("Lutfen araci alacaginiz gunu yaziniz (Ornek 12.05): ");
        String alinacakGun = scanner.nextLine();

        System.out.println("Lutfen alis saatini yaziniz (Ornek 15:00): ");
        String alisSaati = scanner.next();

        System.out.println("Lutfen araci teslim edeceginiz gunu yaziniz (Ornek 12.05): ");
        String teslimGunu = scanner.nextLine();

        System.out.println("Lutfen araci teslim edeceginiz saati yaziniz (Ornek 12:05): ");
        String teslimSaati = scanner.nextLine();

        //burda bilgileri verecegimiz ekrani hazirliyoruz
        System.out.println("\033[33m \n********************************************** \033[0m");

        String aGun = alinacakGun.substring(0, 2); //12.05 string
        int intAGun = Integer.parseInt(aGun);

        String aAy = alinacakGun.substring(3);
        int intAAy = Integer.parseInt(aAy);
        System.out.println(" Alis tarihi: "+intAGun+"."+intAAy); // 12.05 int

        String tGun = teslimGunu.substring(0, 2); //15.05
        int intTGun = Integer.parseInt(aGun);

        String tAy = teslimGunu.substring(3);
        int intTAy = Integer.parseInt(aAy);
        System.out.println(" Teslim tarihi: "+intTGun+"."+intTAy); // 15.05


        // Simdi alis tarihini teslim gununden once olmesini engelliyoruz
        if( (intAAy > intTAy)) {
            System.out.println("Araci aldiginiz ay teslim tarihinden sonra olamaz");
            aracTalepEt(); // burda kullanicin tekrar giris yapmasini sagliyoruz

        } else if (intAGun>intTGun) {
            System.out.println("Araci aldiginiz gun teslim tarihinden sonra olamaz");


        }else {

        }
        kiralanacakGunSayisi=(intTAy-intAAy)*30 + (intTGun-intAGun);
        System.out.println("\033[36m Arac toplam " + kiralanacakGunSayisi + " gün kiralanmistir. \033[0m");

        System.out.println("\033[33m ********************************************** \033[0m");



    }
    // Simdi arabalari isteyecegiz
    public static void arabaOzellikleri(){

        AracIsteme mercedesMaybach=new AracIsteme("MERCEDES", "maybach", "Diesel", "Automatic",250);
        AracIsteme audi           =new AracIsteme("AUDI", "R8", "Diesel", "Automatic",350);
        AracIsteme teslaModelY    =new AracIsteme("TESLA", "Model Y", "Electric", "Automatic",150);
        AracIsteme bmwX5          =new AracIsteme("BMW", "X5", "Essence", "Manuel",100);
        AracIsteme bmwI3          =new AracIsteme("BMW", "I3", "Electric", "Automatic",150);
        AracIsteme renaultZOE     =new AracIsteme("RENAULT", "ZOE", "Electric", "Automatic",75);
        AracIsteme citroenC5      =new AracIsteme("Citroen", "C5", "Essence", "Manuel",100);

        // Bu araclari olusturdugumuz arac listesine ekliyoruz
        aracTalepListesi.add(mercedesMaybach);
        aracTalepListesi.add(audi);
        aracTalepListesi.add(teslaModelY);
        aracTalepListesi.add(bmwX5);
        aracTalepListesi.add(bmwI3);
        aracTalepListesi.add(renaultZOE);
        aracTalepListesi.add(citroenC5);

        System.out.println("\033[34m \n***** **** *** ** * Arac talep listesi * ** *** **** ***** \033[0m");
        System.out.println("Lutfen talep ettiginiz araci seciniz" +
                "\n 1. MERCEDES - MayBach - Diesel - Automatic - €250" +
                "\n 2. AUDI R8 - R8 - Diesel - Automatic - €350" +
                "\n 3. TESLA -  Model Y - Electric - Automatic- €150" +
                "\n 4. BMW - X5 - Essence - Manuel - €100" +
                "\n 5. BMW - I3 - Electric - Automatic - €150" +
                "\n 6. RENAULT - ZOE - Electric - Automatic - €75" +
                "\n 7. CITROEN - C5 - Essnce - Manuel - 100");

        int secim=0;




    }

    }


