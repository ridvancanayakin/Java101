import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Sayi giriniz :");
		int a = s.nextInt();
		System.out.print("Çýktýsý : "+a);
		islem(a,a,true);

	}
	static void islem(int x,int i, boolean b) {
		
		if(b==true) {
			if(i>0) {
				System.out.print(" "+(i-5));
				islem(x, i-5,true);
			}else {
				islem(x, i,false);
			}
		}else {
			if(i!=x) {
				System.out.print(" "+(i+5));
				islem(x,i+5,false);}
			else
				return;
		}
	}
}
