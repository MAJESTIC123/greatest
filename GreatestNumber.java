package logics;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		int count=0;
		int max=0;
		System.out.println("Enter the size of elements");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements to store");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Greatest no : "+max);
		for(int i=0;i<n;i++) {
		if(max==a[i]) {
			count++;
		}
		}
		System.out.println("No of times " +max+ " occured is :"+count);
	}
}
