import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,c,max,min;
		Scanner s= new Scanner(System.in);
		System.out.println("Ýlk Sayi : ");
		a=s.nextInt();
		System.out.println("Ýkinci Sayi : ");
		b=s.nextInt();
		System.out.println("Son Sayi : ");
		c=s.nextInt();
		 if ((a >= b) && (a >= c)) {
	            if ((b >= c)) {
	                System.out.print("a > b > c");
	            } else {
	                System.out.print("a > c > b");}

	        } else if ((b >= a) && (b >= c)) {
	            if (a > c) {
	                System.out.print("b > a > c");
	            } else {
	                System.out.print("b > c > a");}
	        } else {

	            if (b > a) {
	                System.out.print("c > b > a");
	            } else {
	                System.out.print("c > a > b");}

	        }
		
	}

}
