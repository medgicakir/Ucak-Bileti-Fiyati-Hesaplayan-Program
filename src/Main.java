import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double normalTutar = 0;
        double indirimliTutar = 0;
        double gidisdonusIndirimi;
        Scanner inp = new Scanner(System.in);
        System.out.println("lütfen KM cinsinden mesafe bilgisi giriniz:");
        int mesafe = inp.nextInt();
        System.out.println("Yolculuk tipi giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş)");
        int yolculukTipi = inp.nextInt();

        if (mesafe <= 0) {
            System.out.println("Hatalı veri girdiniz!");
        }
        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı veri girdiniz!");
        }

        if (mesafe >= 0) {
            normalTutar = mesafe * 0.10;
        }

        System.out.println("Yaşınızı giriniz");
        int yas = inp.nextInt();

        if (yas < 12) {
            indirimliTutar = (normalTutar - (normalTutar * 0.5));
        }
        if (yas >= 12 && yas <= 24) {
            indirimliTutar = (normalTutar - (normalTutar * 0.1));
        }
        if (yas > 65) {
            indirimliTutar = (normalTutar - (normalTutar * 0.3));
        }

        if (yolculukTipi == 1) {
            System.out.println("Toplam Tutar:"+indirimliTutar);
        } else {
            gidisdonusIndirimi=(indirimliTutar-(indirimliTutar*0.2));
            System.out.println("Toplam Tutar:"+gidisdonusIndirimi);
        }
    }
}