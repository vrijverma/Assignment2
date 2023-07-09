package in.vrij.main;


	public class Question2 {
		public static int partition(int arr[], int low, int high)
		{
//			 choosing last index of array as a pivot
			int pivot=arr[high];
			int i= low-1;
			
			for(int j=low; j<high; j++) // traverse of an array [low to high]
			{
				if(arr[j] < pivot)
				{
					i++;
				  // SWAP
					
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
					
				}
			}
			
			i++;
			int temp= arr[i];
			arr[i] = pivot;
			arr[high]= temp;
			return i; // pivot index [after partition position of i ]
			
			
		}
		public static void quickSort(int arr[], int low , int high)
		{
			
//			 check our low value always less than to high
			if(low < high )
			{
				int pidx = partition(arr, low, high); // pivot index(pidx)
				
				quickSort(arr, low, pidx-1);
				quickSort(arr, pidx+1, high);
						
			}
		}
		

	public static void main(String[] args) {
		
//		WAP to sort an array using Quick Sort Algorithm
		int[] arr= {10,30,4,2,7,20};
		int n=arr.length;
		
		quickSort(arr, 0, n-1); // 0 is starting point and n-1 is last index of an array
		
		// print
		for(int i=0 ; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	}
	

