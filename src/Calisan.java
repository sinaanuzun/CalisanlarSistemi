public class Calisan {

    public int no;
    public String isim;
    public String soyisim;
    public int tecrube;
    public double maas;

    public Calisan() {
    }

    public Calisan(int no, String isim, String soyisim, int tecrube, double maas) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.tecrube = tecrube;
        this.maas = maas;
    }

    public void calisanBilgileriniGoster() {
        System.out.println("------ Çalışan Bilgileri ------");
        System.out.println("Numara  : " + no);
        System.out.println("İsim    : " + isim);
        System.out.println("Soyisim : " + soyisim);
        System.out.println("Tecrübe : " + tecrube);
        System.out.println("Maaş    : " + maas);
    }

    public void zamYap(int zamDegeri){
        System.out.println("Maaşınıza " + zamDegeri + " TL zam yapıldı..");
        System.out.println("Güncel maaşınız : " + (maas+zamDegeri));
    }

    public void formatAt(String isletimSistemi, String eleman){
        System.out.println(eleman +" "+ isletimSistemi + " işletim sistemine format atıyor..");
    }

}
