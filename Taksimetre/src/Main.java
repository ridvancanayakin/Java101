import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double km,ucret;
		Scanner s= new Scanner(System.in);
		System.out.println("Kaç km yolculuk yaptiniz?");
		km=s.nextDouble();
		ucret=10.0+km*2.20;
		boolean min=(ucret<20);
		ucret=min?20:ucret;
		System.out.println("Ödemeniz gereken ücret= "+ucret);
	}
}
