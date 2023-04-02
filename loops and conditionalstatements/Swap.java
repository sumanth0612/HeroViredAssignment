import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");

        int b=sc.nextInt();
        //for numbers swapping is simply done by xor without using third variable for two numbers
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("numA : "+a);
        System.out.println("numB : "+b);
        sc.close();

    }
}
