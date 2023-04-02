public class Q5_MoveOnes {
    public static void main(String[] args) {
        int a[]={3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int c=0;
        System.out.println("Array elements after moving Ones to end: ");
        for(int i=0;i<a.length;i++){
            if(a[i]!=1)
            System.out.print(a[i]+" ");
            else
            c+=1;
        }
        while(c>0){
            System.out.print(1+" ");
            c-=1;
        }
    }
}
