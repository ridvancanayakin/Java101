import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String n,p,r,np;
		np="java123";
		Scanner s = new Scanner(System.in);
		System.out.println("Kullanýcý Adýnýz: ");
		n = s.nextLine();
		System.out.println("Þifreniz: ");
		p = s.nextLine();
		if(n.equals("patika")&&p.equals(np)) {
			System.out.println("Giriþ Yaptýnýz !");
		}else {
			System.out.println("Bilgiler Yanlýþ!\n Þifrenizi Sýnýflamak Ýster misiniz? y\\n");
			r=s.nextLine();
			if(r.equals("y")) {
				System.out.println("Þifrenizi Giriniz");
				n=s.nextLine();
				if(np.equals(n)) {
					System.out.println("Þifre eski þifre ile ayný olamaz");
					return;
				}else {
					np=n;
					System.out.println("Þifre deðiþtirildi !");
				}
			}else {
				System.out.println("Þifre Deðiþtirilmeden Program Sonlandýrýlacak !");
			}
		}
	}
}
