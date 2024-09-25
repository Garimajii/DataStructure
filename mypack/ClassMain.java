package mypack;

public class ClassMain {

	public static void main(String[] args) {
		
		int[] arr= {1,345,423,55,72,46,221,2446656,34};
		int arr1 =MinAndMax.find(arr);
		System.out.println("Maximum element in the array is "+arr1);
		
		System.out.println("****************");
		
		int[] ar= {1,345,423,-55,72,46,-221,2446656,34};
		int ar1 =MinAndMax.find1(ar);
		System.out.println("Minimum element in the array is "+ar1);
	}

}
