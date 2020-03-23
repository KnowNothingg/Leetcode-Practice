
public class QuickSort {
	
	public void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if(left < index - 1) {
			quickSort(arr, left, index - 1);
		}
		if(index < right) {
			quickSort(arr, index, right);
		}
		
	}

	private int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2];
		while(left <= right) {
			//find element on left that should be on right
			while(arr[left] < pivot)	left++;
			
			// find element on right that should be on left
			while(arr[right] > pivot)	right--;
			
			// swap elements, and move left and right indices
			if(left <= right) {
				swap(arr, left, right);	// swap elements
				left++;
				right--;
			}
		}
		return left;
	}

	private void swap(int[] arr, int left, int right) {
		int swap = arr[left];
		arr[left] = arr[right];
		arr[right] = swap;
	}

}
