import java.util.ArrayList;

public class MineSweeper {
	String[][] field;
	ArrayList<Integer> mines=null;
	int mRow,mColumn;
	
	public MineSweeper(int row,int column) {
		mRow=row;
		mColumn=column;
		field=new String[mRow][mColumn];
		initField(mRow*mColumn);
	}
	
	private void initField(int fieldNumber) {
		for (int i=0;i<mRow;i++) {
			for (int j=0;j<mColumn;j++){
				field[i][j]="-";
			}
		}
		printField();
		mines = new ArrayList<>();
		for(int i=0;i<fieldNumber/4;i++) {
			int mine = (int)(Math.random()*fieldNumber+1);
			if(!mines.contains(mine)) {
				mines.add(mine);
			}else {
				i--;
			}
		}
		mines.sort(null);
		System.out.println("mines: "+mines.toString());
	}
	
	public int checkMine(int row,int column) {
		if(row>mRow || column > mColumn || row<1 || column<1) {
			System.out.println("Girdiðiniz satýr ve sütun sayýlarý sýnýrlarýn dýþýnda. Tekrar deneyiniz !");
		}else if(mines.contains((row-1)*mColumn+column)) {
			System.out.println("Mayýna bastýnýz oyun bitti !");
			System.out.println("Mayýnlar : " +mines.toString());
			return -1;
		}else {
			field[row-1][column-1]=Integer.toString((howManyMines(row, column)));
		}
		return printField();
	}
	
	private int howManyMines(int row, int column) {
		int result = 0;
		for(int i=Math.max(row-1, 1);i<=Math.min(mRow, row+1);i++) {
			for(int j=Math.max(column-1, 1);j<=Math.min(mColumn,column+1);j++) {
				if( i==row && j==column)
					continue;
				else if(mines.contains((i-1)*mColumn+j)) {
					result ++;
				}
			}
		}
		return result;
	}
	
	private int printField() {
		int result=0;
		for (int i=0;i<mRow;i++) {
			for (int j=0;j<mColumn;j++){
				System.out.print(field[i][j]);
				if(field[i][j].equals("-")){
					result++;
				}
			}
			System.out.println("");
		}
		return result;
	}
	
}
