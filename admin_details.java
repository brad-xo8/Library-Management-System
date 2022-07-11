public class admin_details {
    class quantity{
        String name;
        int quantity;
        quantity(String name,int quantity){
            this.name=name;
            this.quantity=quantity;
        }
    }
    int size;
    quantity arr[];
    int front;
    int rear;
    admin_details(int size){
        this.size=size;
        arr=new quantity[size];
        front=-1;
        rear=-1;
    }
    public void add_book_admin(String name,int quantity){
        if(rear==size-1){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            arr[rear]=new quantity(name,quantity);
        }
    }
    public void delete_book_admin(String name){
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
        }
    }
    public void update_quantity(String Name,int quantity){
        for(int i=0;i<size;i++){
            if(arr[i].name.equals(Name)){
                arr[i].quantity=quantity;
            }
        }
    }
    public int getQuantity(String Name){
        int a; 
        for(int i=0;i<size;i++){
            if(arr[i].name.equals(Name)){
                a=(arr[i].quantity);
            }
        }
        return a;
    }
    public boolean isEmpty_details(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
}
