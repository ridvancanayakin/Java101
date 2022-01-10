import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		double alan,yariCap,aci;
		Scanner s= new Scanner(System.in);
		System.out.println("Dairenin yarýçapýný giriniz: ");
		yariCap=s.nextDouble();
		System.out.println("Dairenin merkez açýsýný giriniz: ");
		aci=s.nextDouble();
		alan=(3.14*yariCap*yariCap)*aci/360;
		System.out.println("Daire diliminin alani: "+alan);
	}
}
