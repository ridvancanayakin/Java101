import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		Scanner s = new Scanner(System.in);
		System.out.println("Hava Kaç Derece?");
		heat = s.nextInt();
		if(heat > 25) {
			System.out.println("Yüzmeye Gidebilirsin");
		}else if(heat >= 15) {
			System.out.println("Piknik Yapabilirsin");
		}else if(heat >= 5) {
			System.out.println("Sinemaya Gidebilirsin");
		}else {
			System.out.println("Kayak Yapabilirsin");
		}
	}

}
