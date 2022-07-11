public class student_details extends book_details{
    class Node{
        String name;
         Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
     Node head;
     Node tail;
    public  void add_book(String name){
        Node new_node=new Node(name);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            tail.next=new_node;
            tail=new_node;
        }
    }
    public  void delete_book(String name){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.name.equals(name)){
                if(temp==head){
                    head=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
            }
            prev=temp;
            temp=temp.next;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public int getCount(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count+=count+1;
            temp=temp.next;
        }
        return count;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.name);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
    }
}
