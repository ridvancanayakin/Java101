import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 int sayi;
	 System.out.print("Bir sayi giriniz : ");
	 Scanner s= new Scanner(System.in);
	 sayi = s.nextInt();
	 for(int i=1;i<=sayi;i=i*20) {
		 System.out.println(i);
	 }
 }
}
