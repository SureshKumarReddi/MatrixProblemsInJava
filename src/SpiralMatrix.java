
public class SpiralMatrix {

	public static void main(String[] args) {

		spiral();
	}

	private static void spiral() {
		int value = 1;
		int n = 3;
		int[][] arr = new int[n][n];

		int minrow = 0;
		int mincol = 0;
		int maxcol = arr[0].length-1;
		int maxrow = arr.length-1;

		while (value <= n * n) {

			for (int i = mincol; i <=maxcol; i++) {
				arr[minrow][i] = value;
				value++;
			}

			for (int i = minrow+1; i <=maxrow; i++) {
				arr[i][maxcol] = value;
				value++;
			}

			for (int i = maxcol - 1; i >= mincol; i--) {
				arr[maxrow][i] = value;
				value++;
			}

			for (int i = maxrow-1; i >=minrow+1; i--) {
				arr[i][mincol] = value;
				value++;
			}

			minrow++;
			mincol++;
			maxrow--;
			maxcol--;
		}
		
		  for (int i = 0; i < arr.length; i++)
	        {
	            for (int j = 0; j < arr.length; j++)
	            {
	                System.out.print(arr[i][j]+ "\t");
	            }
	             
	            System.out.println();
	        }
	}

}
