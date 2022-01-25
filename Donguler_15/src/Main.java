import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		int sayi, a = 0 , b = 1, c;
		System.out.print("Kaç Elemanlý Fibonacci Serisi? : ");
		Scanner s= new Scanner(System.in);
		sayi = s.nextInt();
		for(int i=0;i<sayi-1;i++) {
			c= a + b;
			System.out.println(a + " + " + b + " = "  + c);
			a = b;
			b = c;
		}
	}
}
