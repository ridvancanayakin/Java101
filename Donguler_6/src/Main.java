import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi,sonuc=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Sayiyi giriniz : ");
		sayi=s.nextInt();
		while(sayi!=0) {
			sonuc=sonuc+sayi%10;
			sayi=sayi/10;
		}
		System.out.println(sonuc);

	}

}
