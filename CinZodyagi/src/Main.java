import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil;
		String[] zod= {"Maymun","Horoz", "Köpek", "Domuz", "Fare", "Öküz"
				,"Kaplan", "Tavþan", "Ejderha", "Yýlan", "At", "Koyun"};
		Scanner s = new Scanner(System.in);
		System.out.println("Doðum Yýlýnýzý Giriniz : ");
		yil=s.nextInt();
		System.out.println("Çin Zodyaðý Burcunuz : "+zod[yil%12]);
	}

}
