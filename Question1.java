package in.vrij.main;

public class Question1 {
//	. WAP to find the duplicates present in an array.
	public static void main(String[] args) {
	
	
	int[] arr= {10,40,20,10,40,50};
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Duplicate element is : " + arr[i]);
			}
		}
	}

}
}
