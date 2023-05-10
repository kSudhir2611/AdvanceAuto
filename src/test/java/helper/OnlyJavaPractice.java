package helper;

public class OnlyJavaPractice {

	public static void main(String[] args) {
		int[] arr = {2,5,6,5,1,2,3,2,5,6,2};
		int n = arr.length;
		int a=findSingleNumberInArray(arr,n);
		System.out.println(a+" ");
		
			
		

	}
	public static int findSingleNumberInArray(int[] arr,int n) 
	{  
		if(arr.length==1) 
		{
			return arr[arr.length];
		}
		int freq[]=new int[n];
		
		for(int i=0;i<n;i++) 
		{
			freq[arr[i]]++;// 0 1 2 3 4 5 6 7 8
		}					//  1 4 1 0 2 2 
		
		for(int j=0;j<freq.length;j++) //2,5,6,5,1,2,3,2,5,6,2
		{
			if(freq[j]==1) 
			{
				return arr[j];
			}
		}
	}
	
}
