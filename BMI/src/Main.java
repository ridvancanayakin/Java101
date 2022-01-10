import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double boy,kilo,bmi;
		Scanner s= new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
		boy=s.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz :");
		kilo=s.nextDouble();
		bmi=kilo/(boy*boy);
		System.out.println("Vücut Kitle Ýndeksiniz : "+bmi);
	}

}
