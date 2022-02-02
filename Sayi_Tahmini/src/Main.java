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
					System.out.println("Tahmin hakkýnýz bitmiþtir. Doðru cevap : "+ number);
					break;
				}
				System.out.print("0-100 aralýðýndaki sayiyi tahmin ediniz : ");
				answer = s.nextInt();
				if(answer==number) {
					System.out.println("Tebrikler. Toplamda "+(6-right)+ " denemede doðru cevabý buldunuz");
					break;
				}else {
					String clue= number>answer? "büyük" : "küçük";
					right--;
					System.out.println("Maalesef cevap doðru deðil. Doðru cebap son tahmininizden "+clue);
					System.out.println("Kalan deneme hakkýnýz : "+right);
				}
			}
		}
	}
}
