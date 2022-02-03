import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int row,column;
		Scanner s = new Scanner(System.in);
		System.out.print("Mayin Tarlasý Boyutlarý \nSatýr : ");
		row = s.nextInt();
		System.out.print("Sütun : ");
		column = s.nextInt();
		MineSweeper mine = new MineSweeper(row, column);
		while(true) {
			int tryRow,tryColumn,result;
			System.out.print("Satýr Giriniz :");
			tryRow=s.nextInt();
			System.out.print("Sütun Giriniz :");
			tryColumn=s.nextInt();
			result=mine.checkMine(tryRow, tryColumn);
			if(result==-1)
				break;
			else if((result-(row*column/4))==0) {
				System.out.println("Oyunu Kazandýnýz Tebrikler");
				break;
			}
		}
	}
}
