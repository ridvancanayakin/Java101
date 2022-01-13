import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int total=0,number=2;
		Scanner s = new Scanner(System.in);
		while(number%2==0) {
			System.out.print("Sayi Giriniz : ");
			number=s.nextInt();
			if (number%4==0) {
				total=total+number;
			}
		}
		System.out.println("4'e bolunen sayilarin toplami : " + total);
	}

}
