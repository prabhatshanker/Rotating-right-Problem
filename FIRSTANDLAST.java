/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int n = read.nextInt();
		    int[] a = new int[n];
		    for(int j=0; j<n; j++){
		        int ele = read.nextInt();
		        a[j] = ele;
		    }
		    int max = a[0] + a[n-1];
		    int sum = 0;
		    for(int j=0; j<n-1; j++){
		        int temp = a[j] + a[j+1];
		        if(temp>sum){
		            sum = temp;
		        }
		    }
		    System.out.println(Math.max(max, sum));
		}
	}
}
