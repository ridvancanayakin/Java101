import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Sayi giriniz :");
		int a = s.nextInt();
		boolean x= asalMi(a,2);
		if(x) 
			System.out.println(a + " Sayisi Asal Sayidir");
		else
			System.out.println(a + " Sayisi Asal Sayi Degildir");
	}
	static boolean asalMi(int a, int b) {
		if(a==1) return false;
		if(a==b) { 
			return true;
		}
		else if(a%b==0) {
			return false;
		}else return asalMi(a,b+1);
	}
}
