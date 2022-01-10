import java.util.Scanner;

public class Main {

public static void main (String[] args) {
	double a,b,c,u,area;
	Scanner s= new Scanner(System.in);
	System.out.println("Üçgenin a kenarýný giriniz: ");
	a=s.nextDouble();
	System.out.println("Üçgenin b kenarýný giriniz: ");
	b=s.nextDouble();
	System.out.println("Üçgenin c kenarýný giriniz: ");
	c=s.nextDouble();
	u=(a+b+c)/2;
	area=Math.sqrt(u*(u-a)*(u-a)*(u-a));
	System.out.println("Üçgenin alaný: "+area);
}

}
