import java.util.Arrays;
import java.util.Scanner;
public class Mainclass {
	
	public static void reverse(int [] arr)
	{
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int [] sumEvenOdd(int[] arr)
	{
		int n=arr.length;
		int [] sum= new int[2];
		sum[0]=0;
		sum[1]=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				sum[0]+=arr[i];
			}
			else
			{
				sum[1]+=arr[i];
			}
		}
		return sum;
	}
	public static double average(int []arr)
	{
		int n=arr.length;
		double av=0;
		for(int i=0;i<n;i++)
		{
			av+=arr[i]/(n*1.0);
		}
		if(n==0)
		{
			return 0;
		}
		return av;
	}
	public static void moveValue(int []arr,int val)
	{
		int n=arr.length;
		int i=0;
		int j=0;
		while(j<n)
		{
		     if(i>n-1)
			{
				arr[j]=val;
				j++;
			}
		     else if(arr[i]!=val)
			{
				arr[j]=arr[i];
				j++;

			}
			i++;
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+ " ");
		}
	}
	public static int[][] transpose(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		int [][] trans = new int[m][n];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) {
				trans[j][i]=arr[i][j];
			}
		}
		return trans;
	}
	public static long f(int n)
	{
		if(n==1)
		{
			return 0;
		}
		long f1=0;
		long f2=1;
		long f3=1;
		for(int i=3;i<=n;i++)
		{
			f3=f2+f1;
			f1=f2;
			f2=f3;
		}
		return f3;
	}
	public static void main (String arg[])
	{
		
	}
}
