import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ilk,iki,islem,sonuc;
		Scanner s= new Scanner(System.in);
		System.out.println("�lk Sayiyi Giriniz : ");
		ilk = s.nextInt();
		System.out.println("�kinci Sayiyi Giriniz : ");
		iki = s.nextInt();
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\nSe�iminizi Giriniz");
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
				System.out.println("Bir sayi 0 a b�l�nemez!");
				return;
			}
			sonuc=ilk/iki;
			break;
		default:
			System.out.println("Yanlis �slem sectiniz");
			return;
		}
		System.out.println("Sonu�: "+sonuc);
	}
}
