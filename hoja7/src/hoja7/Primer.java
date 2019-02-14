package hoja7;

public class Primer {

	public static void main(String[] args) {
		int t, i, p, cont = 0, nfilas, ncols, nprofs;
		int table[][][] = new int[1][5][3];
		nfilas = table.length;
		ncols = table[nfilas-1].length;
		nprofs = table[nfilas-1][ncols-1].length;
		for (t = 0; t < nfilas; t++) {
			for (i = 0; i < ncols; i++) {
				for(p=0; p < nprofs;p++){
					table[t][i][p]=(int)(Math.random()*(101)); // (t * (table[t].length)) + i + j + 1;
					System.out.println(t + " " + i + " " + p + " : " + table[t][i][p]);// tabulador \t
				}
			}
			System.out.println();
		}
		System.out.println("final del programa");
	}

}
