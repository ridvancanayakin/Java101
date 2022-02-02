import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println("----------------------------------- \nYeni Oyun");
			int right=5,number,answer;
			boolean result=false;
			number=(int)(Math.random()*100);
			Scanner s= new Scanner(System.in);
			while(!result) {
				if(right==0) {
					System.out.println("Tahmin hakk�n�z bitmi�tir. Do�ru cevap : "+ number);
					break;
				}
				System.out.print("0-100 aral���ndaki sayiyi tahmin ediniz : ");
				answer = s.nextInt();
				if(answer==number) {
					System.out.println("Tebrikler. Toplamda "+(6-right)+ " denemede do�ru cevab� buldunuz");
					break;
				}else {
					String clue= number>answer? "b�y�k" : "k���k";
					right--;
					System.out.println("Maalesef cevap do�ru de�il. Do�ru cebap son tahmininizden "+clue);
					System.out.println("Kalan deneme hakk�n�z : "+right);
				}
			}
		}
	}
}
