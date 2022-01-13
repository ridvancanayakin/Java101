import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int top=0,adet=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Sayi Giriniz: ");
		int sayi= s.nextInt();
		for(int i=1;i<sayi;i++) {
			if(i%12==0) {
				top=top+i;
				adet++;
				}
		}
		try {
			System.out.println(top/adet);
		} catch (Exception e) {
			System.out.println("Hata");
		}
		

	}

}
