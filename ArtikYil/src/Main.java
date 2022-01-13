import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil;
		String result="Yýl Deðildir!";
		Scanner s= new Scanner(System.in);
		System.out.print("Yýl Giriniz : ");
		yil=s.nextInt();
		if(yil%400==0) {
			result="Yýldýr";
		}else if(yil%100==0) {
			result="Yýl Deðildir!";
		}else if(yil%4==0) {
			result="Yýldýr";
		}
		System.out.println(yil +" bir artýk "+ result);
	}

}
