public class BinarySearch {
	public static void main(String[]args){
		int[]array = {11,22,33,44};
		int target = 5454;
		int left = 0;
		int right = array.length -1;
		int result = -1;
		
		while(left <= right){
			int mid = left+(right-left)/2;
			
			if (array[mid] ==target){
				result = mid;
				break;
			}
			
			if (array[mid]<target){
				left = mid + 1;
			}else{
				right = mid-1;
			}
		}
		
		if (result != -1){
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}
	}
}