import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Taban deðeri giriniz :");
		int a = s.nextInt();
		System.out.print("Üs deðeri giriniz :");
		int b = s.nextInt();
		int c=hesapla(a,b);
		System.out.println("Sonuç: "+c);
	}
	static int hesapla(int a , int b) {
		if(b==0) {
			return 1;
		}else {
			return (a*hesapla(a,b-1));
		}
		
	}
}
