import java.util.*;
public class Q6_Frequencies {
    public static void main(String[] args) {
        int a[]={3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int b[]={1, 2, 3, 5, 9};
        HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
                hm.put(a[i],hm.get(a[i])+1);
            else
                hm.put(a[i],1);
        }
        for(int i=0;i<b.length;i++)
        {
            
            System.out.println("Frequency of "+b[i]+" :"+hm.getOrDefault(b[i],0));
        }
    }
}
