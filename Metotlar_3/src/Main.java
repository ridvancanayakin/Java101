import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Taban de�eri giriniz :");
		int a = s.nextInt();
		System.out.print("�s de�eri giriniz :");
		int b = s.nextInt();
		int c=hesapla(a,b);
		System.out.println("Sonu�: "+c);
	}
	static int hesapla(int a , int b) {
		if(b==0) {
			return 1;
		}else {
			return (a*hesapla(a,b-1));
		}
		
	}
}
