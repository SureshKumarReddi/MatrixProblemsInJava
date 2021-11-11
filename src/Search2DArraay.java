
public class Search2DArraay {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 11 }, { 9, 10, 12 } };
		int target = 12;
		boolean searchArray = searchArray(arr, target);
		System.out.println(searchArray);
	}

	private static boolean searchArray(int[][] arr, int target) {
		int rowlength = arr.length;
		int collength = arr[0].length;

		int start = 0;
		int end = rowlength * collength - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			//In Matrix to identify mid element value we require two index to denote the row and column, 
			//first understand normal binary search for better understanding this problem 
			
			
			//logic for getting the row and column for the mid element of a matrix.
			int midX = mid / collength;
			int midY = mid % collength;

			if (arr[midX][midY] == target)
				return true;

			if (arr[midX][midY] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return false;
	}

}
