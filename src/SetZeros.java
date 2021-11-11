
public class SetZeros {

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 3 }, { 0, 5, 0 }, { 1, 8, 9 } };
		setZeros(arr);
	}

	private static void setZeros(int[][] arr) {

		boolean rowflag = false;
		boolean colflag = false;

		// 1.searching row wise
		// checking the first column has at least one zero if we found one zero in first
		// row zero column then
		// we don't need to go down in row wise

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == 0) {
				colflag = true;
				break;
			}
		}

		// 2.searching column wise
		// checking the first row has at least one zero while traversing towards column
		// end
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[0][i] == 0) {
				rowflag = true;
				break;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][0] == 0 ||  arr[0][j]== 0) {
					arr[i][j] = 0;
				}
			}
		}
		if (rowflag) {
			for (int i = 0; i < arr.length; i++) {
				arr[i][0] = 0;
			}
		}
		if (colflag) {
			for (int i = 0; i < arr[0].length; i++) {
				arr[0][i] = 0;
			}
		}
		System.out.println(" printing the array ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
