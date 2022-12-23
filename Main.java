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

void reverseTraversal() {
  Node ptr=this.head;
  
  while(ptr.next!=head){
    ptr=ptr.next;
  }
  //ptr=ptr.next;
  Node last=ptr;
  while(ptr.prev!=last){
System. out. println(ptr.data);
    ptr=ptr.prev;
  }
 // ptr=ptr.prev;
System. out. println(ptr.data);

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
    
Node ptr= new Node() ;
   Node p=this.head;
    while(p.next!=head)
{
p=p.next;
}
    
    p. next=ptr;
    ptr. prev=p;
    ptr. next=this.head;
    ptr. data=data;
    head. prev=ptr;
    this. head=ptr;
  }  
    
    
   void insertAtIndex( int data, int index) {  
    Node h=this.head;
   Node  ptr=new Node();  
  
   Node p=h;  
     Node q=h.next;
  int i=0;  
  while(i!=index-1){  
    p=p.next;  
    q=q.next;
  i++;  
    
  }  
     p. next=ptr;
     ptr. prev=p;
     ptr. next=q;
     q. prev=ptr;
  ptr.data=data;  
  
  
  }  
    
    
  void insertAtLast( int data) {  
   Node p=head;  
   Node  ptr=new Node();  
  
  while(p.next != head) {  
  p=p.next;  
  }  
  p.next=ptr;  
    ptr. prev=p;
  ptr.next=head;  
    head. prev=ptr;
  ptr.data=data;  
    
    
  }  
    
    
  
    
    


   //deletion  
    
    
  void deleteAtFirst() {  
    
   Node  ptr=head;  
   
    
  while(ptr.next != head) {  
  ptr=ptr.next;  
  }  
    head=head.next;
  ptr.next=head;  
    head.prev=ptr;

    
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
    q=q.next;
  p.next=q;  
    q. prev=p;
  
  }  
    
  void deleteAtLast() {  
   Node  p=head;  
 
  while(p.next != head. prev) {  
  p=p.next;  
  }  
  p. next=head;
    head. prev=p;
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
head. prev=fourth;
second.data=2;
second. prev=head;
second. next=third;
third. prev=second;
third.data=3;
third. next=fourth;
fourth. prev=third;
fourth.data=4;
fourth. next=head;

    //calling methods

CircularLinkedList list=new CircularLinkedList(head);

    list.traverse() ;
list. insertAtIndex(30,2);
    list. insertAtBegin(33);
    list. insertAtLast(30) ;
    list. deleteAtFirst() ;
    list. deleteAtLast() ;
    list. deleteAtIndex(2) ;
    list. traverse () ;
   list. sortDecend() ;
    list. traverse () ;
    list. sortAcend() ;
list. traverse () ;
    list. reverseTraversal() ; }}