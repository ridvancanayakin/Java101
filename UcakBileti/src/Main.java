import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int mesafe,yas,tip;
		double ucret;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Mesafeyi km t�r�nden giriniz : ");
		mesafe= s.nextInt();
		System.out.print("Ya��n�z� giriniz : ");
		yas= s.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ): ");
		tip= s.nextInt();
		if(mesafe < 1 || yas < 1 || ( tip!=1 && tip!=2)) {
			System.out.println("Hatal� Veri Girdiniz !");
		}else {
			ucret=mesafe*0.1;
			if(yas<12) {
				ucret=ucret*0.5;
			}else if(yas<24) {
				ucret=ucret*0.9;
			}else if(yas>65) {
				ucret=ucret*0.7;
			}
			if(tip==2) {
				ucret=ucret*1.6;
			}
			
			System.out.println("Toplam Tutar = "+ucret+"TL");
		}
		
	}
}
