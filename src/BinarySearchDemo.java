
public class BinarySearchDemo {

	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		 int target = 12;
		 
		 boolean result = binarySearch(arr,target);
		 System.out.println(result);
	}

	private static boolean binarySearch(int[] arr, int target) {
		 int start= 0;
		 int end = arr.length-1;
		 
		 while(start<=end) {
			 int mid = start + (end - start) / 2;
			 
			 if(arr[mid] == target)
				 return true;
			 if(arr[mid]<target)  
				 start = mid +1 ; 
				 else
					end = mid -1;
			  
		 }
		return false;
	}

}
