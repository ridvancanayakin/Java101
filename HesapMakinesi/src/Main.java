import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ilk,iki,islem,sonuc;
		Scanner s= new Scanner(System.in);
		System.out.println("Ýlk Sayiyi Giriniz : ");
		ilk = s.nextInt();
		System.out.println("Ýkinci Sayiyi Giriniz : ");
		iki = s.nextInt();
		System.out.println("1-Toplama\n2-Çýkarma\n3-çarpma\n4-Bölme\nSeçiminizi Giriniz");
		islem = s.nextInt();
		switch(islem) {
		case 1:
			sonuc=ilk+iki;
			break;
		case 2:
			sonuc=ilk-iki;
			break;
		case 3:
			sonuc=ilk*iki;
			break;
		case 4:
			if(iki==0) {
				System.out.println("Bir sayi 0 a bölünemez!");
				return;
			}
			sonuc=ilk/iki;
			break;
		default:
			System.out.println("Yanlis Ýslem sectiniz");
			return;
		}
		System.out.println("Sonuç: "+sonuc);
	}
}
