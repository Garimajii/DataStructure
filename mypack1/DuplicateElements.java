package mypack1;

public class DuplicateElements {
	
	public static boolean findDuplicate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int duplicate=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(duplicate==arr[j])
				{
					duplicate=arr[j];
					System.out.println(duplicate);
				}
				
			}
			
		}
		return true;
	}

}
