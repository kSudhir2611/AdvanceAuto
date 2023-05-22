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
		System.out.println("is Number Palindrom: "+isNumberPalindrom(125));
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

}
