import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double boy,kilo,bmi;
		Scanner s= new Scanner(System.in);
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz :");
		boy=s.nextDouble();
		System.out.println("L�tfen kilonuzu giriniz :");
		kilo=s.nextDouble();
		bmi=kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz : "+bmi);
	}

}
