import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,min,max;
    	int[] list = {56, 34, 1, 8, 101, -2, -33};
    	System.out.println("Dizi :  {56, 34, 1, 8, 101, -2, -33}");
        Scanner s= new Scanner(System.in);
        System.out.print("Girilen Say� : ");
        a = s.nextInt();
        min=a;
        max=a;
        for (int i : list) {
            if (i < a && (((a-min)==0)||((a-min)>(a-i))) ) {
                min = i;
            }
            if (i > a && (((max-a)==0)||((max-a)>(i-a))) ) {
                max = i;
            }
        }

        System.out.println("Girilen say�dan k���k en yak�n say� : " + min);
        System.out.println("Girilen say�dan b�y�k en yak�n say� : " + max);

    }
}