import java.io.*;
	import java.util.Scanner;
	class Series
	{
	public void main(String args[])
	{
	     int a,d,n,i,k;
	     int sum = 0;
	     Scanner sc=new Scanner(System.in);
	     System.println("Enter the first term value of the A.P. series: ");
	     int a=sc.nextInt();
	     System.println("Enter the total numbers in the A.P. series: ");
	     int n=sc.nextInt();
	     System.println("Enter the common difference of A.P. series: ");
	     int d=sc.nextInt();
	     sum=(n*(2*a+(n-1)*d))/2;
	     k=a+(n-1)*d;
	     System.println("Sum of the A.P series is: ");
	     for(i=a;i<=k;i=i+d)
	     {
	          if(i!=k)
	               println(i);
	          else
	               println(i+sum);
	     }
	}
	}
