package BinaryTrees;

public class BinaryTree {
    Node root;

    BinaryTree() { root = null; }
    void inorder(Node node){
        if(node==null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    void preorder(Node node){
        if(node==null) return;
        System.out.print(node.data + " ");
        preorder(node.left);

        preorder(node.right);
    }
    void postorder(Node node){
        if(node==null) return;

        postorder(node.left);

        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal is");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println();
        System.out.println("preorder traversal is");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println();
        System.out.println("postorder traversal is");
        tree.postorder(tree.root);
    }
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int item) {
        this.data = item;
        left=right=null;
    }

}
