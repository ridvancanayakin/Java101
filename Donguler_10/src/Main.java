import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b,c,ebob=-1,ekok=-1;
		Scanner s= new Scanner(System.in);
		System.out.print("Ýlk Sayi: ");
		a=s.nextInt();
		System.out.print("Ýkinci Sayi: ");
		b=s.nextInt();
		c=Math.min(a, b);
		while(c>1)
		{
			if(a%c==0 && b%c==0)
			{
				ebob=c;
				ekok=a*b/c;
				break;
			}else {
				c -= 1;
			}
		}
		System.out.println("EBOB : "+ebob + " EKOK: "+ekok);
	}
}
