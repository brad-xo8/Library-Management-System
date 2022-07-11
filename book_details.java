public class book_details extends admin_details{
    book_details(){
        super(10);  
    }
    //binary tree node
    class Node {
        String name;
        Node left;
        Node right;
        Node(String name) {
            this.name = name;
            this.left = null;
            this.right = null;
        }
    }
    //binary tree
    Node root;
    //add book to binary tree
    public void add_book(String name) {
        Node new_node = new Node(name);
        if (root == null) {
            root = new_node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (name.compareTo(current.name) < 0) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new_node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = new_node;
                        return;
                    }
                }
            }
        }
    }
}
