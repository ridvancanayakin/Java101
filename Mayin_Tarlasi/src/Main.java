import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int row,column;
		Scanner s = new Scanner(System.in);
		System.out.print("Mayin Tarlas� Boyutlar� \nSat�r : ");
		row = s.nextInt();
		System.out.print("S�tun : ");
		column = s.nextInt();
		MineSweeper mine = new MineSweeper(row, column);
		while(true) {
			int tryRow,tryColumn,result;
			System.out.print("Sat�r Giriniz :");
			tryRow=s.nextInt();
			System.out.print("S�tun Giriniz :");
			tryColumn=s.nextInt();
			result=mine.checkMine(tryRow, tryColumn);
			if(result==-1)
				break;
			else if((result-(row*column/4))==0) {
				System.out.println("Oyunu Kazand�n�z Tebrikler");
				break;
			}
		}
	}
}
