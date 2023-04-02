import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.println("Please Enter the number: ");
            int n=sc.nextInt();
            if(n%2==0)
                System.out.println("The given Number - "+n+" is a EVEN Number");
            else
                System.out.println("The given Number - "+n+" is a ODD Number");
            System.out.println("Do you want to Continue y/n ");
            char c = (sc.next()).charAt(0);
            if(c=='N'|| c=='n'){
                break;
            }
            
        }
        sc.close();
    }
}
