package okulprojesi;

public class OkulOgrenciOgretmenBilgileri {//pojo
   /*
   BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.

1. Bu   programda,   Öğrenci   ve   Öğretmen   Kayıtları   ile   ilgili   işlemler   yapılabilmelidir.
Kayıtlarda şu bilgiler olabilmelidir.
Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

2. Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
aşağıdaki gibi bir menü gösterilsin.
====================================
 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
====================================
 1- ÖĞRENCİ İŞLEMLERİ
 2- ÖĞRETMEN İŞLEMLERİ
 Q- ÇIKIŞ

3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

============= İŞLEMLER =============
 1-EKLEME
 2-ARAMA
 3-LİSTELEME
 4-SİLME
 5-ANA MENÜ
 Q-ÇIKIŞ
SEÇİMİNİZ:

4. İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
ekleme,   kimlik   no   ile   silme   ve   arama,   var   olan   tüm   kişileri   listeleme   gibi   işlemler
yapılabilmelidir.   Bunun   yanında   bir   üst   menüye   dönme   veya   çıkış   işlemleri   de
yapılabilmelidir.
    */
    // Bu   programda,   Öğrenci   ve   Öğretmen   Kayıtları   ile   ilgili   işlemler   yapılabilmelidir.
    //Kayıtlarda şu bilgiler olabilmelidir.
    //Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    //Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

    private String ogretnmenAdSoyad;//ogretmen bilgileri
    private String ogretnmenId;
    private int ogretnmenYas;
    private String ogretnmenBrans;
    private int  ogretnmenBSicilNo;


    private String ogrenciAdSoyad;//ogrenci bilgileri
    private String ogrenciId;
    private int ogrenciYas;
    private int ogrenciNumara;
    private int  ogrenciSinif;

    public OkulOgrenciOgretmenBilgileri(String ogretnmenAdSoyad, String ogretnmenId, int ogretnmenYas, String ogretnmenBrans, int ogretnmenBSicilNo) {
        this.ogretnmenAdSoyad = ogretnmenAdSoyad;
        this.ogretnmenId = ogretnmenId;
        this.ogretnmenYas = ogretnmenYas;
        this.ogretnmenBrans = ogretnmenBrans;
        this.ogretnmenBSicilNo = ogretnmenBSicilNo;

    }

    public OkulOgrenciOgretmenBilgileri(String ogrenciAdSoyad, String ogrenciId, int ogrenciYas, int ogrenciNumara, int ogrenciSinif) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        this.ogrenciId = ogrenciId;
        this.ogrenciYas = ogrenciYas;
        this.ogrenciNumara = ogrenciNumara;
        this.ogrenciSinif = ogrenciSinif;

    }

    public OkulOgrenciOgretmenBilgileri() {

    }

    public String getOgretnmenAdSoyad() {
        return ogretnmenAdSoyad;
    }

    public void setOgretnmenAdSoyad(String ogretnmenAdSoyad) {
        this.ogretnmenAdSoyad = ogretnmenAdSoyad;
    }

    public String getOgretnmenId() {
        return ogretnmenId;
    }

    public void setOgretnmenId(String ogretnmenId) {
        this.ogretnmenId = ogretnmenId;
    }

    public int getOgretnmenYas() {
        return ogretnmenYas;
    }

    public void setOgretnmenYas(int ogretnmenYas) {
        this.ogretnmenYas = ogretnmenYas;
    }

    public String getOgretnmenBrans() {
        return ogretnmenBrans;
    }

    public void setOgretnmenBrans(String ogretnmenBrans) {
        this.ogretnmenBrans = ogretnmenBrans;
    }

    public int getOgretnmenBSicilNo() {
        return ogretnmenBSicilNo;
    }

    public void setOgretnmenBSicilNo(int ogretnmenBSicilNo) {
        this.ogretnmenBSicilNo = ogretnmenBSicilNo;
    }

    public String getOgrenciAdSoyad() {
        return ogrenciAdSoyad;
    }

    public void setOgrenciAdSoyad(String ogrenciAdSoyad) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
    }

    public String getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(String ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas(int ogrenciYas) {
        this.ogrenciYas = ogrenciYas;
    }

    public int getOgrenciNumara() {
        return ogrenciNumara;
    }

    public void setOgrenciNumara(int ogrenciNumara) {
        this.ogrenciNumara = ogrenciNumara;
    }

    public int getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(int ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;

    }

    @Override
    public String toString() {
        return "OkulOgrenciOgretmenBilgileri{" +
                "ogretnmenAdSoyad='" + ogretnmenAdSoyad + '\'' +
                ", ogretnmenId='" + ogretnmenId + '\'' +
                ", ogretnmenYas=" + ogretnmenYas +
                ", ogretnmenBrans='" + ogretnmenBrans + '\'' +
                ", ogretnmenBSicilNo=" + ogretnmenBSicilNo +
                '}';
    }


    }



