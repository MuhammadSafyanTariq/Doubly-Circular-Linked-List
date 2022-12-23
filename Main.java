class Node{
	
	int data;
	 Node next;
  Node prev;
	
}

class CircularLinkedList{
Node head;
  
CircularLinkedList (Node head) {
  this. head=head;
}


void traverse() {  
   Node  h=this.head;  
  while(h.next!=head) {  
  System.out.println(h.data);
  h=h.next;  
  }  
System.out.println(h.data);
  System.out.println("finish");
  }




void search (int data) {  
  int index=0;  
  int num;  
  Node ptr=this.head;  
  while(ptr.next != head) {  
  if(ptr.data==data) {  

    System.out.println("The number is present at "+index+" index"  );
  }
  ptr=ptr.next;  
  index++;  
  }  
    
  if(ptr.data==data) {  
    
  System.out.println("The number is present at "+index+" index"  );
  }  
  } 


  void insertAtBegin( int data) {  
   Node p=this.head;  
   Node ptr=new Node();  
  while(p.next != head) {  
  p=p.next;  
  }  
  p.next=ptr;  
  
  p.next=ptr;  
  ptr.next=this.head;  
  ptr.data=data;  
  this. head=ptr;
  }  
    
    
   void insertAtIndex( int data, int index) {  
    Node h=this.head;
   Node  ptr=new Node();  
  
   Node p=h;  
  int i=0;  
  while(i!=index- 1){  
  p=p.next;  
  i++;  
    
  }  
  ptr.data=data;  
  ptr.next=p.next;  
  p.next=ptr;  
  
  }  
    
    
  void insertAtLast( int data) {  
   Node p=head;  
   Node  ptr=new Node();  
  
  while(p.next != head) {  
  p=p.next;  
  }  
  p.next=ptr;  
  ptr.next=head;  
  ptr.data=data;  
    
    
  }  
    
    
  void insertAtAdd(  Node  adr,int data) {  
   Node p=head;  
   Node ptr=new Node();  
  
  ptr.next=adr.next;  
  adr.next=ptr;  
  ptr.data=data;  
  }  
    
    //deletion


   //deletion  
    
    
  void deleteAtFirst() {  
    
   Node  ptr=head;  
   Node  p=head;  
    
  while(p.next != head) {  
  p=p.next;  
  }  
  p.next=ptr.next;  
    
    
    
  //free(ptr) ;  
    
  this. head=p.next;  
    
  }  
    
    
    
  void deleteAtIndex(int index) {  
   Node  p=this.head;  
   Node  q=this.head.next;  
  int i=0;  
  while(i<index-1) {  
  p=p.next;  
  q=q.next;  
  i++;  
  }  
  p.next=q.next;  
  //free(q) ;  
  }  
    
  void deleteAtLast() {  
   Node  p=head;  
   Node  q=head.next;  
  while(q.next != head) {  
  p=p.next;  
  q=q.next;  
  }  
  p.next=head;  
    
 // free(q) ;  
 } 
  
  
   void sortAcend() { 
  Node  ptr=head; 
    
  
  Node  p; 
  Node  q; 
  Node  h=head; 
 int temp; 
 int i=0; 
   for(p=head; p.next!=this.head;p=p.next){ 
  
 for(q=p.next; q.next!=head;q=q.next){ 
   if(p.data>q.data){ 
     temp=p.data; 
     p.data=q.data; 
     q.data=temp; 
    if(i==0) { 
 h=p; 
 } 
   } 
  
 } 
 if(q.data<p.data){ 
     temp=p.data; 
     p.data=q.data; 
     q.data=temp; 
     } 
  i++; 
 } 
 this. head=h; 
 }
void sortDecend() { 
  Node  ptr=head; 
    
  
  Node  p; 
  Node  q; 
  Node  h=head; 
 int temp; 
 int i=0; 
   for(p=head; p.next!=this.head;p=p.next){ 
  
 for(q=p.next; q.next!=head;q=q.next){ 
   if(p.data<q.data){ 
     temp=p.data; 
     p.data=q.data; 
     q.data=temp; 
    if(i==0) { 
 h=p; 
 } 
   } 
  
 } 
 if(q.data>p.data){ 
     temp=p.data; 
     p.data=q.data; 
     q.data=temp; 
     } 
  i++; 
 } 
 this. head=h; 
 }

  
}



public class Main {
	public static void main(String[] args) {

//creating Nodes
    
		Node head=new Node() ;
    Node second=new Node() ;
    Node third=new Node() ;
    Node fourth=new Node() ;

//linking Nodes
    
head.data=1;
head. next=second;
head. prev=null;
second.data=2;
second. prev=head;
second. next=third;
third. prev=second;
third.data=1;
third. next=fourth;
fourth. prev=third;
fourth.data=1;
fourth. next=head;

    //calling methods

CircularLinkedList list=new CircularLinkedList(head);

    list.traverse() ;
    list. search (1);
    list.insertAtBegin(30);
    list.traverse() ;
    list.insertAtLast(33);
    list.traverse() ;
    list.insertAtIndex(29,2);
    list.traverse() ;
    list.insertAtAdd(second,31);
    list.traverse() ;
list. deleteAtFirst ();
    list.traverse() ;
    list. deleteAtLast() ;
    list.traverse() ;
    list. deleteAtIndex(2) ;
    list.traverse() ;
    list. sortAcend() ;
list.traverse() ;

list. sortDecend() ;
list.traverse() ;







    
	}
}
