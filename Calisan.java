/*
Öncelikle Özellikkleri Tanımlayacalım
Constructor Olusturalım.
Getter-Setter Metodlarını Oluşturalım.

bilgileriGoster metodu yazalım.

 */

public class Calisan {        //SuperClass'ımız. Üst Sınıfımız.

    private String ad;
    private String soyAd;
    private int id;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calisan(String ad, String soyAd, int id) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.id = id;
    }

    public void bilgileriGoster () {

        System.out.println("Calısan Bilgilerii...");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyAd);
        System.out.println("Id: " + id);



    }
}
