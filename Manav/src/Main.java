import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double armut,elma,domates,muz,patlican;
		Scanner s = new Scanner(System.in);
		System.out.println("Armut Ka� Kilo");
		armut=s.nextDouble();
		System.out.println("Elma Ka� Kilo");
		elma=s.nextDouble();
		System.out.println("Domates Ka� Kilo");
		domates=s.nextDouble();
		System.out.println("Muz Ka� Kilo");
		muz=s.nextDouble();
		System.out.println("Patlican Ka� Kilo");
		patlican=s.nextDouble();
		System.out.println("Toplam Tutar : "+(armut*2.14+elma*3.67+
				domates*1.11+muz*0.95+patlican*5));
		
		
	}
}
