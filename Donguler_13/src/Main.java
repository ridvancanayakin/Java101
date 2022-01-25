import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a;
		Scanner s= new Scanner(System.in);
		System.out.print("Bir sayý giriniz: ");
		a=s.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a*2; j++) {
				//System.out.println("i: "+i +"   j: "+j);
				if(j>i && j<2*a-i) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}
