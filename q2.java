public class q2
{
	public static void sort(String[]a, int W)
	{

		int N = a.length;
		int R = 256;

		String[] aux = new String[N];
		
		for(int d = W-1; d >= 0; d--)
		{
			int[] count = new int[R+1];

			//compute frequency counts
			for(int i=0; i<N; i++)
			{
				count[a[i].charAt(d) + 1]++;
			}
			//Tranaform count to indices
			for(int r=0; r<R; r++)
			{
				count[r+1] += count[r];
			}
			//Distribute
			for(int i=0; i<N; i++)
			{
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			//copy back
			for(int i=0; i<N; i++)
			{
				a[i] = aux[i];
			}
		}
		for(int i=0; i<=N; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String []args)
	{
		String []a = {"Dorji","Karma","Yeshey","Sonam","Jigme"};
		int w = 5;
		sort(a, w);
	}
}