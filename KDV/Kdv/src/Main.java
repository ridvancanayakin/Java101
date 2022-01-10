
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double ucret;
		Scanner s= new Scanner(System.in);
		System.out.println("ücreti gir: ");
		ucret=s.nextDouble();
		double kdv=ucret>1000.0? 0.08 : 0.18;
		System.out.println("KDV'li Fiyat ="+ ucret*(1+kdv));
		System.out.println("KDV tutarý = "+(ucret*kdv));
	}

}
