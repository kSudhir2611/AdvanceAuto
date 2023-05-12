package helper;

import java.util.Arrays;

public class OnlyJavaPractice {

	public static void main(String[] args) {
		
		int[] arr = {0,1,0,2,2,1};
		int n = arr.length;
		//int[] a = soterdsquredArray(arr,n);
		//int[] a=arrywithEvenNumberthenodd(arr,n);
		int[] a = sortArrayWithoutUsingSortFunction(arr,n);
		for(int b:a)
		{
			System.out.print(b+" ");
		}
			
		

	}
	public static int[] soterdsquredArray(int[] arr,int n) 
	{
		int res[] = new int[n];
		int me=n-1, frnd=0;
		int i = n-1;
		while(me >= frnd) 
		{
			if(Math.abs(arr[me])>=Math.abs(arr[frnd])) 
			{
				res[i]=Math.abs(arr[me]);
				me--;
				i--;
			}else 
			{
				res[i]=Math.abs(arr[frnd]);
				frnd++;
				i--;
			}
		}
			
			for(int j=0;j<n;j++) 
			{
				res[j]=res[j]*res[j];
			}
				
		return res;
	}
	
	public static int[] arrywithEvenNumberthenodd(int arr[],int n) 
	{
		/*int[] res = new int[n];
		int me=n-1,frnd=0;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]%2==1) 
			{
				res[me]=arr[i];
				me--;
			}else 
			{
				res[frnd]=arr[i];
				frnd++;
			}
		}
		return res;*/
		
		int me = 0,temp;
		for(int i =0;i<n;i++) 
		{
			if(arr[i]%2==0) 
			{
				temp=arr[me];
				arr[me]=arr[i];
				arr[i]=temp;
				me++;
			}
		}
		return arr;
	}
	
	public static int[] sortArrayWithoutUsingSortFunction(int[] arr,int n) 
	{
		int me=0,temp;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]==0) 
			{
				temp=arr[me];
				arr[me]=arr[i];
				arr[i]=temp;
				me++;
			}
		}
			me=n-1;
			for(int j=n-1;j>=0;j--) 
			{
				if(arr[j]==2) {
				temp=arr[me];
				arr[me]=arr[j];
				arr[j]=temp;
				me--;
				}
			}
		
		return arr;
	}
	
}
