import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int f=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        if(n==1) 
        f=0;
        else{
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            f=0;
        }
        }
        if(f==1)
            System.out.println("The given number "+n+" is a Prime Number");
        else
            System.out.println("The given number "+n+" is NOT a Prime Number");
        sc.close();
    }
}
