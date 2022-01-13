import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,r,c;
		Scanner s= new Scanner(System.in);
		System.out.print("Ýlk sayiyi giriniz : ");
		n=s.nextInt();
		System.out.print("Ýkinci sayiyi giriniz : ");
		r=s.nextInt();
		c=faktoriyel(n)/(faktoriyel(r)*faktoriyel(n-r));
		System.out.println("C("+n+","+r+") : "+c);
		
				

	}
	private static  int faktoriyel(int a ) {
		int result=1;
		for(int i=1;i<=a;i++) {
			result=result*i;
		}
		return result;
			
	}
	

}
