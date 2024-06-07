/*

Calisan Sınıfından kalıtım al.       -> extends Calisan
Constructor olustur.   ( Otomatik olusturuluyor Add Constructor ile)
Ekstra Özellik ekle -> private String diller;
Ekstra Eklenilen Özelliği Constructor'a ekle. ( parantez içine ekle) ve  this.diller = diller; yap.
Ekstra Metod ekle. -> formatAt
 */

public class Yazilimci extends Calisan {

    private String diller;   // Ekstra Özellik.

    public Yazilimci(String ad, String soyAd, int id,String diller) {
        super(ad, soyAd, id);
        this.diller = diller;
    }

    public void formatAt (String isletim_sitemi) {

        System.out.println(getAd() + " " + isletim_sitemi + "ni yüklüyor..");
    }


    /*
    Calisan Sınıfındaki bilgileriGoster metodunu kullancagız. Fakat Override Ederek. Sağtık -> Override Methods seç.
    Override ederken kalıtım aldıgımız sınıftaki method ismi aynı olacak. Fakat otomatik yazıyor :)

    Override ettiğimizde Calisan sınıfındaki bilgileriGoster methodu iptal olur yeni override ettiğimiz metod geçerli olur.
     */
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();    // üst class taki bilgileri cagırdık.
        System.out.println("Yazılımcının Bildiği Diller: " + diller);

    }
}
