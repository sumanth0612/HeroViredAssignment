import java.util.*;
class RemoveDuplicates{
    static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Linked List : ");
        int n=sc.nextInt();
        System.out.println("Enter Elements : ");
        Node temp=new Node(sc.nextInt());
        Node start=temp;
        System.out.println("Enter Elements : ");
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(start!=null){
            if(!al.contains(start.data))
                al.add(start.data);
            start=start.next;
        }
        Node temp2=new Node(al.get(0));
        Node result=temp2;
        for(int i=1;i<al.size();i++){
            temp2.next=new Node(al.get(i));
            temp2=temp2.next;
        }
        while(result!=null){
            System.out.print(result.data+" ");
            result=result.next;
        }
    }
}