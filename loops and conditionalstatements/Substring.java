import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Starting Index: ");
        int start=sc.nextInt();
        System.out.println("Ending Index: ");
        int end=sc.nextInt();
        System.out.println("Substring of "+str+" from "+start+" to "+end+" is: "+str.substring(start,end+1)); 
        sc.close();
    }
}
