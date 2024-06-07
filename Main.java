/*
Çalışanlar Programı Yapalım. -> Inheritance Kullanarak.

Calisan ->SuperClass Olacak ( Üst Sınıf)
Yazilimci ->SubClass (Alt Sınıf)
Yonetici ->SubClass ( Alt Sınıf)

 */

import java.util.Scanner;

public class Main {

    public static void main ( String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Çalışanlar Programına Hoşgeldiniz..");
        System.out.println("*******************************");

        String islemler = "İşlemler..:\n"
                + "1.Yazılımcı İşlemleri\n"
                + "2.Yönetici İşlemleri\n"
                + "Çıkış İçin q'ya Basınız...";


        System.out.println(islemler);
        System.out.println("*******************************");

        while (true) {

            System.out.print("İşlemi Seçiniz..");
            String islem = scanner.nextLine();

            if ( islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor.");
                break;
            } else if ( islem.equals("1")) {

                Yazilimci yazilimci = new Yazilimci("Eda","Gider",2525,"Java, Python");
                String yazilimci_islem = "1.FormatAt\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış İçin q'ya Basınız..";

                System.out.println(yazilimci_islem);


                while (true) {


                    System.out.print("İşlemi Seçiniz..:");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {

                        System.out.println("Programdan Çıkılıyor..");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.print("İşletim Sistemi : ");
                        String isletimSitemi = scanner.nextLine();

                        yazilimci.formatAt(isletimSitemi);


                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    } else {

                        System.out.println("Geçersiz İşlemm...");
                    }

            }

            } else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Ayaz" , "Gider" , 123,5);
                String yoneticiİslem= "Yönetici İşlemleri\n"
                        + "1. Zam Yap\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış İçin q'ya Basınız";

                System.out.println(yoneticiİslem);

                while (true) {

                    System.out.print("İşleminizi Seçiniz..");
                    String yntc_islem = scanner.nextLine();

                    if ( yntc_islem.equals("q")) {

                        System.out.println("Programdan Çıkılıyor..");
                        break;
                    } else if (yntc_islem.equals("1")) {

                        System.out.print("Zam Miktarını Giriniz..:");
                        int zammiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zammiktari);

                    } else if (yntc_islem.equals("2")) {

                        yonetici.bilgileriGoster();

                    } else {

                        System.out.println("Geçersiz Yönetici İşlemi..");
                    }
                }


            }else {
                System.out.println("Geçersiz İşlem..");
            }

        }



    }
}
