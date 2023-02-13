import java.util.*;
class LinkedList{
    static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Linked list 1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter the Size of Linked list Elements  : ");
        Node temp1=new Node(sc.nextInt());
        Node start1=temp1;
        for(int i=1;i<n1;i++){
            temp1.next=new Node(sc.nextInt());
            temp1=temp1.next;
        }
        System.out.println("Enter the Size of Linked list 2 : ");
        int n2=sc.nextInt();
        System.out.println("Enter the Size of Linked list Elements  : ");
        Node temp2=new Node(sc.nextInt());
        Node start2=temp2;
        for(int i=1;i<n2;i++){
            temp2.next=new Node(sc.nextInt());
            temp2=temp2.next;
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(start1!=null){
            al.add(start1.data);
            start1=start1.next;
        }
        while(start2!=null){
            al.add(start2.data);
            start2=start2.next;
        }
        Collections.sort(al);
        Node temp=new Node(al.get(0));
        Node start=temp;
        for(int i=1;i<al.size();i++){
            temp.next=new Node(al.get(i));
            temp=temp.next;
        }
        while(start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
}
