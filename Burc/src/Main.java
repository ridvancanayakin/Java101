import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ay,gun,toplam;
		String burc = null;
		Scanner s= new Scanner(System.in);
		System.out.println("Kaçýncý ayda doðdunuz?");
		ay = s.nextInt();
		System.out.println("Kaçýncý günde doðdunuz?");
		gun = s.nextInt();
		
		if(ay<1 || ay>12 || gun<1 || gun>31) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		
		toplam=ay*100+gun;
		if(toplam>=1222 || toplam<=21) {
			burc="Oðlak";
		}else if(toplam<1222 && toplam>=1122) {
			burc="Yay";
		}else if(toplam<1122 && toplam>=1023) {
			burc="Akrep";
		}else if(toplam<1023 && toplam>=923) {
			burc="Terazi";
		}else if(toplam<923 && toplam>=823) {
			burc="Baþak";
		}else if(toplam<823 && toplam>=723) {
			burc="Aslan";
		}else if(toplam<723 && toplam>=623) {
			burc="Yengeç";
		}else if(toplam<623 && toplam>=522) {
			burc="Ýkizler";
		}else if(toplam<522 && toplam>=421) {
			burc="Boða";
		}else if(toplam<421 && toplam>=321) {
			burc="Koç";
		}else if(toplam<320 && toplam>=220) {
			burc="Balýk";
		}else if(toplam<220 && toplam>=122) {
			burc="Kova";
		}
		System.out.println("Burcunuz : "+burc);
	}

}
