import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil;
		String[] zod= {"Maymun","Horoz", "K�pek", "Domuz", "Fare", "�k�z"
				,"Kaplan", "Tav�an", "Ejderha", "Y�lan", "At", "Koyun"};
		Scanner s = new Scanner(System.in);
		System.out.println("Do�um Y�l�n�z� Giriniz : ");
		yil=s.nextInt();
		System.out.println("�in Zodya�� Burcunuz : "+zod[yil%12]);
	}

}
