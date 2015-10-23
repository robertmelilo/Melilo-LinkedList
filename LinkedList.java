
import java.util.*;   

 class Node {  
     int data;
     Node next;   
      
            Node(int d){ 
          data = d;
          next= null;   
      }  
 }  



 public class LinkedList{
     
     public static void main(String[]args) {  
         Scanner in = new Scanner(System.in);
         
         int data,ch,size=0;
         Node head=null,tail=head;
         
         while(true){
             System.out.println("1.Insert\n2.Display\n3.Delete\n4.Exit");  
             ch=in.nextInt();
             switch(ch)  
                {  
                case 1:  
                     System.out.println("Enter your Element");  
                     data = in.nextInt();   
                     Node newNode= new Node(data);
                     
                     if(head ==null){
                         head=newNode;  
                          tail=head;}  
                     else{
                         tail.next=newNode;// inserting element 
                         tail = newNode;
                     }
                     size++;
                     break;  
                
                case 2:
                    if(size>0){
                        for(Node temp = head;temp!=null;temp=temp.next)
                            System.out.print(temp.data + "\t");
                        System.out.println();}
                    else 
                        System.out.println("LinkedList is empty");
                    break;  
                    
                case 3:  
                     if(size>0){
                         System.out.println("Enter your element");
                         data = in.nextInt();
                         
                         if(head.data==data)
                             head=head.next;
                         else{
                             tail=head;
                             Node temp=head.next;
                             while(temp!=null)  
                          { 
                              
                              if(temp.data==data){  
                                         tail.next=temp.next;   
                                         size--;   
                                         break;   
                                    }  
                              
                               tail=temp;  
                               temp=temp.next;   
                          }  
                       
                     }else System.out.println("LinkedList is empty");  
                break;   
                default: System.exit(0);   
                }  
           }  
      }  
 }  
