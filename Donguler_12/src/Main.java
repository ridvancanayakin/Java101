import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,top = 0;
		Scanner s= new Scanner(System.in);
		System.out.print("Bir say� giriniz: ");
		a=s.nextInt();
		for(int i=(a+1)/2;i>=1;i--) {
			if(a%i == 0) {
				top += i;
			}
		}
		if(top == a && a!=1) {
			System.out.println(a +" M�kemmel say�d�r");
		}else {
			System.out.println(a +" M�kemmel say� degildir");
		}
	
	}
}
