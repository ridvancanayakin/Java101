import java.util.Scanner;

public class Main {

public static void main (String[] args) {
	double a,b,c,u,area;
	Scanner s= new Scanner(System.in);
	System.out.println("��genin a kenar�n� giriniz: ");
	a=s.nextDouble();
	System.out.println("��genin b kenar�n� giriniz: ");
	b=s.nextDouble();
	System.out.println("��genin c kenar�n� giriniz: ");
	c=s.nextDouble();
	u=(a+b+c)/2;
	area=Math.sqrt(u*(u-a)*(u-a)*(u-a));
	System.out.println("��genin alan�: "+area);
}

}
