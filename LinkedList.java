
import java.util.Scanner;
class Node{
    int data;
    Node nextNode;
    Node(int n)
    {
        this.data=n;
        this.nextNode=null;
    }
} 
public class Main{
    
    public Node addNodeAtEnd(Node head,int n)
    {
       Node node=new Node(n);
       Node itr=head;
       if(head==null)
       {
           head=node;
       }
       else{
       while(itr.nextNode!=null)
       {
           itr=itr.nextNode;
       }
       itr.nextNode=node;
       }
       return head;
    }
    public void printLinkedList(Node head){
       while(head!=null)
       {
          System.out.print(head.data+" ");
          head=head.nextNode;
       } 
    }
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       Main m=new Main();
       int t=sc.nextInt();
       Node head=null;
       while(t>0)
       {
           t--;
           System.out.println("Enter");
           int n=sc.nextInt();
          head=m.addNodeAtEnd(head,n);
       }
       m.printLinkedList(head);
    }
}