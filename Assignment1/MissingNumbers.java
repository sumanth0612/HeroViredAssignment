import java.util.*;
public class MissingNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.print("Enter the Size of an Array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the Array Elements : ");
		
		int max=-1;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i])max=arr[i];
		}
		int arr2[]=new int[max+1];
		for(int i=0;i<n;i++) {
			arr2[arr[i]]=1;
		}
		for(int i=1;i<=max;i++) {
			if(arr2[i]!=1) {
				System.out.print(i+" ");
			}
		}
	}

}
