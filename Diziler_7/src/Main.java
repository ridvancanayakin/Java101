
public class Main {
	public static void main(String[] args) {
		int [][] matris= {
				{2,3,4},
				{5,6,4}
				};
		int[][] tMatris=new int[3][2];
		System.out.println("Matris : ");
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				System.out.print(""+matris[i][j]);
				tMatris[j][i]=matris[i][j];
			}System.out.println("");
		}
		System.out.println("Transpoze : ");
		for(int i=0;i<tMatris.length;i++) {
			for(int j=0;j<tMatris[0].length;j++) {
				System.out.print(""+tMatris[i][j]);
			}System.out.println("");
		}
	}
}
