import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Ders değişkenleri
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        int notToplami = (matematik + fizik + kimya + turkce + tarih + muzik);
        double notOrtalamasi = notToplami / 6.0;
        System.out.println("Not ortalamasi: "+notOrtalamasi);
        int notSonucu = (int)(notOrtalamasi / 60);
        String sonuc = "Sınıfı Geçti".repeat(notSonucu);
        System.out.println(sonuc);
        int tersNotSonucu = (int)((100-notOrtalamasi) / 60);
        sonuc = "Sınıfta kaldı".repeat(tersNotSonucu);
        System.out.println(sonuc);

    }
}
