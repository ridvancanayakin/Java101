import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b,min = 0,max = 0;
		Scanner s= new Scanner(System.in);
		System.out.print("Ka� tane say� gireceksiniz: ");
		a=s.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.print(i+". Say�y� giriniz: ");
			b=s.nextInt();
			if(i==1 || b<min) {
				min=b;
			}
			if(i==1 || b>max) {
				max=b;
			}
		}
	System.out.println("En b�y�k say�: "+max);
	System.out.println("En k���k say�: "+min);
	}
}
