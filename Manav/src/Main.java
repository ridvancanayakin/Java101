import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double armut,elma,domates,muz,patlican;
		Scanner s = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo");
		armut=s.nextDouble();
		System.out.println("Elma Kaç Kilo");
		elma=s.nextDouble();
		System.out.println("Domates Kaç Kilo");
		domates=s.nextDouble();
		System.out.println("Muz Kaç Kilo");
		muz=s.nextDouble();
		System.out.println("Patlican Kaç Kilo");
		patlican=s.nextDouble();
		System.out.println("Toplam Tutar : "+(armut*2.14+elma*3.67+
				domates*1.11+muz*0.95+patlican*5));
		
		
	}
}
