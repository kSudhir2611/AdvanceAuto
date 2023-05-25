package BasicJavaProgram;

public class JavaPrograms {
	static int fact = 1;
	static int a=0,b=1,c;
	public static void main(String[] args) {
		
		//swapingTwoNumberWithThirdVariable(3,5);
		//swapingTwoVariableWithoutUsingThirdVariable(5,9);
		//factorial(5);
		//System.out.println(factorialUsingRecursion(10));
		//printFibonacchiSeries(0,1,10);
		//System.out.print(a+" "+b+" ");
		//printFibonacchiusingRecursion(10);
		//reverseNumber(789654);
		//System.out.println("is Number Palindrom: "+isNumberPalindrom(125));/
		//reverseTheString("Sudhir");
		//armstrongNumber(1331);
		//rowByColumnPattern(5,5);
		//rightAngleTrianglePattern(5);
		//invertedRightAnglePattern(5);
		//trianglePattern(5);
		//onlyBoundryPattern(5);
		//FindTwolargestNumber(new int[] {3,5,6,33,12});
		//patternnew(5);
		//findNumberofUCandLCcount("MaHaRaShtra");
		//removeDuplicatesFromString("aabbhhhhhhhhhhhhhhhhhhhhhhhhhhccdd");
		rotateRightLeftString("Sudhir",2);
		
	}
	public static void swapingTwoNumberWithThirdVariable(int a, int b) 
	{
		int temp;
		System.out.println("Number before Swaping:- a="+a+" b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after Swaping:- a="+a+" b="+b);	
	}
	
	public static void swapingTwoVariableWithoutUsingThirdVariable(int a, int b) 
	{
		System.out.println("Number before Swaping:- a="+a+" b="+b);
		a=a*b;//45
		b=a/b;
		a=a/b;
		System.out.println("Number after Swaping:- a="+a+" b="+b);
	}
	
	public static void factorial(int a) 
	{
		
		int fact = 1;
		for(int i=1;i<=a;i++) 
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	public static int factorialUsingRecursion(int n) 
	{
		if(n==0) 
		{
			return 1;
		}
		fact = fact * n;
		factorialUsingRecursion(n-1);
		return fact;
	}
	
	public static void printFibonacchiSeries(int a,int b,int n) 
	{
		System.out.print(a+" "+b+" ");
		int sum = 0;
		for(int i=0;i<n;i++) 
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}
	
	public static void printFibonacchiusingRecursion(int n) 
	{
		if(n>=1) 
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			printFibonacchiusingRecursion(n-1);
		}
		
	}
	
	public static void reverseNumber(int n) 
	{
		int rem,rev=0;
		System.out.println("Given number: "+n);
		while(n!=0) 
		{
			rem=n%10;
			rev = rev *10 + rem;
			n = n /10;
		}
		System.out.println("reverse Number: "+rev);
	}
	
	public static boolean isNumberPalindrom(int num) 
	{
		int rem,rev=0;
		int p = num;
		while(num!=0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num = num /10;
		}
		if(rev==p) 
		{
			return true;
		}else
			return false;
	}
	
	public static void reverseTheString(String s) 
	{
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("reversed String: "+rev);
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	public static void armstrongNumber(int n) 
	{
		int num = n;
		int arm=0,rem;
		while(n!=0) 
		{
			rem = n%10;
			arm = arm + (rem*rem*rem);
			n = n/10;
		}
		if(arm==num)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not armstrong");
	}
	
	public static void rowByColumnPattern(int m,int n) 
	{
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rightAngleTrianglePattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedRightAnglePattern(int n) 
	{
		for(int i=n;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void trianglePattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)              // i=1 ----*
			{									//i=2 ---**
				System.out.print(" ");
			}
			for(int j =1 ;j<=i;j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void onlyBoundryPattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i==1||j==1||i==n|| j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void FindTwolargestNumber(int[] arr) 
	{
		int large,secondlarge;
		large=secondlarge=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>large) 
			{
				secondlarge=large;
				large=arr[i];
			}
			else if(arr[i]>secondlarge && arr[i]!=large)
				secondlarge=arr[i];	
		}
		System.out.println("largest: "+large);
		System.out.println("Secondlargest: "+secondlarge);
	}
	
	public static void patternnew(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void findNumberofUCandLCcount(String s) 
	{
		int uppercase=0,lowercase=0;
		for(int i=0;i<s.length();i++) 
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				uppercase++;
			else
				lowercase++;
		}
		
		System.out.println("Uppercase letter in "+s+" is "+uppercase+" and lowercase letter "+lowercase);
	}
	

	public static void removeDuplicatesFromString(String s) 
	{
		String str = new String();
		for(int i=0;i<s.length();i++) //aabbccdd
		{
			char c = s.charAt(i);
			if(str.indexOf(c)<0) 
			{
				str += c;
			}
		}
		System.out.println(str);
	}
	
	public static void rotateRightLeftString(String s,int d) 
	{
		String str = s.substring(d)+s.substring(0, d);
		System.out.println("rotate left :"+str);
		
		String str1 = s.substring(s.length()-d)+s.substring(0,s.length()-d);
		System.out.println("right rotate :"+str1);
	}

}
