import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil;
		String result="Y�l De�ildir!";
		Scanner s= new Scanner(System.in);
		System.out.print("Y�l Giriniz : ");
		yil=s.nextInt();
		if(yil%400==0) {
			result="Y�ld�r";
		}else if(yil%100==0) {
			result="Y�l De�ildir!";
		}else if(yil%4==0) {
			result="Y�ld�r";
		}
		System.out.println(yil +" bir art�k "+ result);
	}

}
