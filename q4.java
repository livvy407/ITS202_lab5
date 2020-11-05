public class q4
{
	int binarySearch(int arr[], int low, int high, int x)
	{
		//to find the index x.
		if(high >= low)
		{
			int mid = low + (high - low) / 2;

			//middle element found in the middle position.
			if(arr[mid] == x)
				return mid;

			//if element is smaller than mid, search left sub array.
			if(arr[mid] > x)
				return binarySearch(arr, low, mid-1, x);

			//else if the element is greater than x, then search right sub array.
			return binarySearch(arr, mid+1, high, x);
		}
		//if element is not present in the array.
		return -1;
	}
	//Deliver method to test above
	public static void main(String []args)
	{
		q4 ob = new q4();
		int arr[] = {3,2,4,8,5,9,1};
		int n = arr.length;
		int x = 9;
		int result = ob.binarySearch(arr, 0, n-1, x);

		if(result == -1)
			System.out.println("Element not present in the array");

		else
			System.out.println("Element found at index:" +result);
	}
}