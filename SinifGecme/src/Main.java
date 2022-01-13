import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int m,t,f,k,mu,top=0,sayi=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Matematik Notunuz : ");
		m = s.nextInt();
		System.out.println("Türkçe Notunuz : ");
		t = s.nextInt();
		System.out.println("Fizik Notunuz : ");
		f = s.nextInt();
		System.out.println("Kimya Notunuz : ");
		k = s.nextInt();
		System.out.println("Müzik Notunuz : ");
		mu = s.nextInt();
		if(m>=0 && m<=100) {
			top=top+m;
			sayi++;
		}
		if(t>=0 && t<=100) {
			top=top+t;
			sayi++;
		}
		if(f>=0 && f<=100) {
			top=top+f;
			sayi++;
		}
		if(k>=0 && k<=100) {
			top=top+k;
			sayi++;
		}
		if(mu>=0 && mu<=100) {
			top=top+mu;
			sayi++;
		}
		System.out.println("sayi: "+sayi);
		double a=top/sayi;
		if(a>=55) {
			System.out.println("Dersi Geçtiniz");
		}else {
			System.out.println("Dersten Kaldýnýz");
		}
		System.out.println("Ortalamanýz : " + a);
		
	}
}
