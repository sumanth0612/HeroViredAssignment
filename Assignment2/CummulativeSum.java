
import java.util.Scanner;
public class CummulativeSum {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			arr[i]+=arr[i-1];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
