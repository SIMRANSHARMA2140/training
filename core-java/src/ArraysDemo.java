
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5};
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		//Using for-each loop
		for (int i : ar) {
			System.out.println(i);
		}
		int mat[][]= { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		int jag[][]= {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
		for (int[] row : jag) {
			for (int i : row) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		Object obj = new Object();
		
		int i = 9;
	}

}
