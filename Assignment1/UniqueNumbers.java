
import java.util.*;
public class UniqueNumbers {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.print("Enter the size of an array : ");
	n=sc.nextInt();
	System.out.print("Enter the array elements : ");
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int max=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	int arr2[]=new int[max+1];
	for(int i=0;i<n;i++) {
		arr2[arr[i]]+=1;
	}
	for(int i=1;i<=max;i++) {
		if(arr2[i]>=1) {
			System.out.print(i+" ");
		}
	}
}
}
