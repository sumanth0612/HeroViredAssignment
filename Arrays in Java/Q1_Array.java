import java.util.*;
public class Q1_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int sum=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        System.out.println("The element with the Minimum value: "+min);
        System.out.println("The element with the Maximum value: "+max);
        System.out.println("Average of all array elements: "+sum/a.length);
        System.out.println("Total number of array elements: "+a.length);
        sc.close();
    }
}
