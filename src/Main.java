import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------- Çalışanlar Sistemine Hoşgeldiniz ---------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Numara değerini giriniz: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.print("İsim değerini giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Soyisim değerini giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.print("Tecrübe değerini giriniz: ");
        int tecrube = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Maaş değerini giriniz: ");
        double maas = scanner.nextDouble();
        scanner.nextLine();

        Calisan calisan = new Calisan(no,isim, soyisim,tecrube,maas);

        String islemler = "1 - Çalışan bilgilerini göster\n" +
                "2 - Zam Yap\n" +
                "3 - Format at";
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("Seçim yapınız : ");
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim){
            case 1:
                calisan.calisanBilgileriniGoster();
                break;
            case 2:
                System.out.print("Zam değerini giriniz : ");
                int zamDegeri = scanner.nextInt();
                scanner.nextLine();
                calisan.zamYap(zamDegeri);
                break;
            case 3:
                System.out.print("Format atacak kişinin ismini giriniz : ");
                String kisi = scanner.nextLine();

                System.out.print("İşletim sistemini yazınız : ");
                String isletimSistemi = scanner.nextLine();

                calisan.formatAt(isletimSistemi,kisi);
                break;
            default:
                System.out.println("Belirtilen aralıkta seçim yapınız!..");
                break;
        }
    }
}