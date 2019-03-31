
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
    
    public Node push(Node head,int n)
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
    public void pop(Node head){
		Node itr=head;
		int data;
       if(itr!=null)
       {
           if(itr.nextNode!=null)
		   {
			   while(itr.nextNode.nextNode!=null)
                 {
                   itr=itr.nextNode;
                 }
				 data=itr.nextNode.data;
				 itr.nextNode=null;
		   }
		   else{
			    data=itr.data;
				 itr=null;
		   }
		   System.out.println("Popped: "+data);
       } else{
		    System.out.println("Empty Stack");
	   }
    }
    public void printStack(Node head)
    {
         if(head.nextNode!=null)  
         {
           printStack(head.nextNode);  
         }
         System.out.println(head.data);
    }
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       Main m=new Main();
       int t=sc.nextInt();
       Node head=null;
       while(t>0)
       {
           t--;
           System.out.println("Enter Data");
           int n=sc.nextInt();
          head=m.push(head,n);
       }
       System.out.println("printStack");
       m.printStack(head);
       m.pop(head);
       System.out.println("printStack");
       m.printStack(head);
       
    }
}