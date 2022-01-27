import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	int[]list=new int[20];
    	ArrayList<Integer> tekrarli=new ArrayList<Integer>();
    	System.out.print("Random List : {");
		for (int i=0; i<list.length-1; i++) {
			list[i]=(int)(Math.random() * ((10) + 1));
			System.out.print(list[i]+", ");
		}
		list[19]=2;
		System.out.println("2}");
		Arrays.sort(list);
		for (int i=0; i<list.length; i++) {
			if(i<list.length-1 && list[i]==list[i+1] && list[i]%2==0 && !tekrarli.contains(list[i])) {
				tekrarli.add(list[i]);
				System.out.println("Tekrarlý Sayý Tespit Edildi : "+list[i]);
			}
		}
    }
}