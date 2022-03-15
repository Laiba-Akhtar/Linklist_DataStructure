
class Node{
    int data;
    Node next;
    Node(){
        next=this;
    }
Node (int data){
    this.data=data;
}
Node (int data2,Node next2){
    this.data=data2;
    this.next=next2;
}
Node left(Node start){
    System.out.println("hello");
    Node p=start;
    int tempdata;
    while(p.next!=null)
{
    if(p.next.next==null){
        tempdata=p.next.data;
        p.next.data=start.data;
        start.data=tempdata;
        
    }
    p=p.next;
}


     return start;
}

 Node mid_node(Node start, Node last){
    if (start == null)
       return null;
     Node a = start;
    Node b = start;
   
while(b!=null&& b.next!=null)
{
    b=b.next.next;
    a=a.next;
}
    return a;
 }
   int BinarySearch(Node head, int value){
     Node start = head;
    Node last = null;
    do{
       Node mid = mid_node(start, last);
       if (mid == null)
          return -1;
       if (mid . data == value)
          return mid.data;
       else if (mid . data < value)
          start = mid . next;
       else
          last = mid;
    }
    while (last == null || last != start);
       return -1;
 }


void display(Node n1){
    Node p=n1;
    int num=0;
while(p!=null){
    System.out.println(p.data);
  

    p=p.next;
    ++num;

}

System.out.println("numofelements="+num);
}

Node insert(Node start,int data){
    Node p=start;
   
    if(start==null||start.data>data){
        start=new Node(data,start);
        return start;
      
    }
    while(p.next!=null)
    {
    if(p.next.data>data){
        break;
    }
    p=p.next;

}
p.next=new Node(data, p.next);
return start;


}
Node merge(Node start,Node start1){

Node p=start;
while(p.next!=null){
    p=p.next;
}
p.next=start1;
return start;

}
void copy(Node start){
Node newnode=new Node(start.data);
Node p=start.next;
Node q=newnode;

while(p!=null){

    q=q.next= new Node(p.data);
    p=p.next;
}
Node pp=newnode;

while(pp!=null){
    System.out.println(pp.data);
  

    pp=pp.next;
   

}
    
}

Node deleteatpos(Node start,int pos){

    Node p=start;
    int index=0;
    
    while(p!=null){
        index++;
        if(index==pos)
        {
      p=p.next;
      break;
        }
        p=p.next;
    
    }
   
    

    return start;
}
Node delete(Node start,int data){
    Node p=start;
if(start==null||start.data>data)
{return start;
    
}
else if(start.data==data){
return start.next;

}
while(p.next!=null){
    if(p.next.data>data)
{
    break;
}
else if(p.next.data==data)
p.next=p.next.next;
p=p.next;
break;
}
return start;

}

Node removelast(Node start){
Node p=start;
while(p!=null)
{
    if(p.next.next==null){
        p.next=p.next.next;
    }
    p=p.next;
}

return start;
}
Node sublist(Node start, int sp, int ep){
Node p=start;
int index =0;
Node newnode=new Node();
Node pp=newnode;
while(p!=null){
    index++;
    if(index>=sp&&index<=ep)
    {
    pp=pp.next=new Node(p.data);
    }
    p=p.next;
}

    return newnode.next;
}

Node replace(Node start,int pos,int data){
Node p=start;
int index=0;

while(p!=null){
    index++;
    if(index==pos)
    {
  p.data=data;
  break;
    }
    p=p.next;

}


return start;
}

// Node replace(Node start,int pos,int data){
//     Node p=start;
//     int index=0;
//     if(pos==1)
//     start.data=data;
//     while(p!=null){
//         index++;
//         if((index+1)==pos)
//         {
//       p.next.data=data;
//       break;
//         }
//         p=p.next;
    
//     }
    
    
//     return start;
//     }
void LinearSearching(Node start,int x){
    Node p=start;
    boolean status=false;
    if(p.data==x)
    {
status=true;
    }
    while(p.next!=null){
       
         if(p.next.data==x)
        {
            status=true;
        }
        p=p.next;
    }
    System.out.println("status of Variable="+status);

}


public static void main(String[] args) {
    Node n=new Node(1);
    n.next=new Node(4);
    n.next.next=new Node(6);
    //System.out.println("hello");
   // n.insert(n, 2, 2);   
    // Node n1=new Node(1);
    // n1.next=new Node(4);
    System.out.println("LINEAR SEARCH shows that");
   n.LinearSearching(n, 6);
    System.out.println("BINARY SEARCH=");
    System.out.println(n.BinarySearch(n, 6));
  
    //n.insert(n, 9);  
   // n.display(n);
   // n.merge(n, n1);
   //n.copy(n);
  // n.display(n.deleteatpos(n, 3));
   // n.display(n.delete(n, 1));
//    System.out.println("LINEAR SEARCH=");
//   n.LinearSearching(n, 6);
   //n.display(n.left(n));
//n.display(n.deleteatpos(n, 3));
   //n.display(n.removelast(n));
  // n.display(n.sublist(n, 1, 2));
//n.sublist(n, 1, 2);
   // System.out.println("helo");
  // System.out.println(n.BinarySearch(n, 6));
   
  


    
}

}