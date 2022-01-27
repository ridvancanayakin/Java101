import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("Dizinin boyutu n : ");
		n =  s.nextInt();
		int[] list = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print((i+1) +". Eleman : ");
			list[i]=s.nextInt();
		}
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
  	}
}
