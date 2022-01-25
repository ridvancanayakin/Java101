import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.print("Sayý Giriniz: ");
		a=s.nextInt();
		b = Integer.valueOf(isPalindrome(String.valueOf(a)));
		if(a==b) {
			System.out.println("palindrom");
		}else {
			System.out.println("palindrom degil");
		}
	}
	static String isPalindrome(String a) {
		int b=Integer.valueOf(a);
		if(b%10==0) {
			return "";
		}else{
			return (String.valueOf(b%10)+isPalindrome(String.valueOf(b/10)));
		}
	} 
}
