import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi;
		double result=0.0;
		Scanner s = new Scanner(System.in);
        System.out.print("Sayýyý giriniz:");
        sayi =s.nextInt(); 
        for (int i = 1; i <=sayi ; i++) {
            result=result+1.0/i;
        }
        System.out.println("Sonuc: "+ result);
	}

}
