public class q1
{
	public static void main(String []args)
	{
		int []arr = {0,1,2,3,1,2,4,3};

		int R = 256;
		int N = arr.length;
		int[] aux = new int[N];
		int[] count = new int[R+1];

		//compute the frequency counts
		for(int i = 0; i < N; i++)
		{
			count[arr[i] + 1]++;
		}
		//Transform count to indexs
		for(int r = 0; r < R; r++)
		{
			count[r+1] += count[r];
		}
		//Distribute the records
		for(int i = 0; i < N; i++)
		{
			aux[count[arr[i]]++] = arr[i];
		}
		//copy back
		for(int i=0; i < N; i++)
		{
			arr[i] = aux[i];
		}
		for(int i = 0; i<=N; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}