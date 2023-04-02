import java.util.Scanner;
public class Percentage {
    public static void main(String args[]) {
       double per=0.0,gpa=0.0,marks,total;
        char grade='a';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks obtained : ");
        marks=sc.nextDouble();
        System.out.println("Enter a Total marks : ");
        total=sc.nextDouble();
        per=(marks/total)*100;
        if(per>=0 && per<60)
        {
            gpa=0.0;
            grade='F';
        }
        else if(per>=60 && per<70)
        {
            gpa=1.0;
            grade='D';
        }
        else if(per>=70 && per<80)
        {
            gpa=2.0;
            grade='C';
        }
        else if(per>=80 && per<90)
        {
            gpa=3.0;
            grade='B';
        }
        else
        {
            gpa=4.0;
            grade='A';
        }
        System.out.println("Percentage : "+String.format("%.2f", per)+"%");
        System.out.println("Grade "+grade+" GPA = "+gpa);
        sc.close();

    }
}
