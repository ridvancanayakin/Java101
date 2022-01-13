import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k,result=1;
		Scanner s= new Scanner(System.in);
		System.out.print("Ussu alinacak sayi : ");
		n=s.nextInt();
		System.out.print("Us olacakk sayi : ");
		k=s.nextInt();
		for(int i = 0;i<k;i++) {
			result=result*n;
		}
		System.out.println("Sonuc : "+result);
	}

}
