package in.vrij.main;

public class Question5 {
//	 use for print array
	public static void printArray(int arr[])
	{
		for(int i=0; i< arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		
//		5. WAP to sort an array using Selection Sort Algorithm
		int[] arr= {10,2,3,6,1,7,8,5,9,4};
		
//		Selection sort [push Smallest  element in the first ]
		
//		Assume first element is smallest
	
	for(int i=0; i<arr.length-1;i++)
	{
		int smallest= i ;
		for(int j=i+1; j<arr.length;j++)
		{
			if(arr[smallest]> arr[j])
			{
				smallest= j;
				
			}
		}
		// SWAP
		int temp = arr[smallest];
		arr[smallest]= arr[i];
		arr[i]=temp;
	}
	printArray(arr);

	}

}
