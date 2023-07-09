package in.vrij.main;

public class Question3 {
	
	
//	 use for print array
	public static void printArray(int arr[])
	{
		for(int i=0; i< arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {

//		3. WAP to sort an array using Bubble Sort Algorithm.
		
		int[] arr= {10,2,3,6,1,7,8,5,9,4};
		
//			Bubble sort [push largest element in the last ]
		
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-i-1;j++)
			{
				if(arr[j]> arr[j+1])
				{
					// SWAP
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArray(arr);


	}

}
