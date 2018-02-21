package lab4;

public class RunTime {

	public static void main(String[] args) {
		int[] arr = new int[100000];
		for(int i = 0; i < 100000; i++) {
			int num = (int) ((Math.random() * 100000) + 1);
			arr[i] = num;
		}
		int key = arr[(int)(Math.random()*100000)];
		long startTime = System.currentTimeMillis();
		linearSearch(arr, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		startTime = System.currentTimeMillis();
		binarySearch(arr, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
	}
	
	public static int linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int key) {
		int lower = 0;
		int upper = arr.length;
		boolean found = false;
		while(!found)
		{
			if(upper < lower)
			{
				return -1;
			}
			int mid = lower + (upper - lower)/2;
			
			if(arr[mid] < key)
			{
				lower = mid + 1;
			}
			if(arr[mid] > key)
			{
				upper = mid - 1;
			}
			if(arr[mid] == key)
			{
				found = true;
				return mid;
			}
		}
		return -1;
	}
}
