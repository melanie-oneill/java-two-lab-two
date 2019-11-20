public class BinaryTree {

    class Node{
        int data;
        Node left, right;

        public Node(int item){
            data=item;
            left = right = null;
        }
    }
    Node root;
    int size;

    public int size() {
        return this.size;
    }

    /* private int size(Node tree) {
        if (tree == null){
            return 0;
        } else {
            return (size(tree.left) + 1 + size(tree.right));
        }
    } */

    public boolean isEmpty(){
       return(size() == 0);
    }


    public void add(int value){
        if (root == null){
            Node first = new Node;
            first.data = value;
        }else{
            add(value, root);
            size++;
        }
    }

    private void add(int value,Node node){
        if(value>node.data){
            if(node.right == null) {
                node.right = new Node(value);
            } else {
                add(value, node.right);
            }

        } else if(value<=node.data){
            if(node.left == null) {
                node.left = new Node(value);
            } else {
                add(value, node.left);
            }
        }
    }

    public boolean exists(int value){
       return exists(value, root);
    }

    private boolean exists(int value, Node node){
        if(node ==null){
            return false;
        } else if (value == node.data){
            return true;
        } else if (value>node.data){
            return exists(value, node.right);
        } else if(value<node.data){
            return exists(value, node.right);
        }
    }

    public Integer max(){
        Node curr = root;
        if(curr == null){
            return null;
        } else {
            while (curr.right != null){
                curr = curr.right;
            }
            return curr.data;
        }
    }

    public int min(){
        Node currleft = root;
        if(currleft == null){
            return null;
        } else {
            while (currleft.left != null){
                currleft = currleft.right;
            }
            return currleft.data;
        }
    }
}