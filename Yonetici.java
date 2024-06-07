/*
Calisan Sınıfından Kalıtım Al.
Ekstra Özellik -> sorumlu_kisi_sayisi;
Constructor Olustur.
bilgileriGoster() methodunu Override Et.
zamYap metodu Oluştur.
 */

public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyAd, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyAd, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı: " + sorumlu_kisi_sayisi);
    }

    public void zamYap ( int zamMiktari) {

        System.out.println(getAd() + " çalışanlara" + zamMiktari + "TL kadar Zaman Yapıyor.");
    }
}
