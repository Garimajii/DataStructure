package mypack;

public class MinAndMax {
	
	public static int find(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int find1(int[] ar)
	{
		int min =ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		return min;
	}

}
