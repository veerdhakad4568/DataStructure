

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
public class Rextester{
    
    public Node addNode(Node head,int n)
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
    public void nThFromEnd(Node head,int n){
		Node slow=head;
        Node fast=head;
        if(n<0)
        {
           System.out.println("invalid request");
           return;
        }
		while((n>0)&&(fast.nextNode!=null))
        {
            fast=fast.nextNode;
            n--;
        }
        if(n>0)
        {
           System.out.println("invalid request");
        }else{
         while(fast.nextNode!=null)
         {
          fast=fast.nextNode;
          slow=slow.nextNode;
         }
         System.out.println("nth node is: "+slow.data);
        }
       
    }
   public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       Rextester m=new Rextester();
       System.out.println("How Many Node You Want To Enter");
       int t=sc.nextInt();
       Node head=null;
       while(t>0)
       {
           t--;
           System.out.println("Enter Node Data");
           int n=sc.nextInt();
          head=m.addNode(head,n);
       }
        System.out.println("Enter Position of the node");
        int p=sc.nextInt();      
        m.nThFromEnd(head,p);
    }
}