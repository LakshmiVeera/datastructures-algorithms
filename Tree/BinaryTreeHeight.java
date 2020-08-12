package Tree;

/**
 * Return the height of a given binary tree
 */
public class BinaryTreeHeight {
    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight =  getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return java.lang.Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String... args) {
        BinaryTreeHeight binaryTree = new BinaryTreeHeight();
        Node root = new Node(20);
        root.left = new Node(10);
        root.left.left = new Node(11);
        root.right = new Node(12);
        root.right.left = new Node(13);
        root.left.left.left = new Node(10);

        System.out.println(binaryTree.getHeight(root));
    }
}

class Node {
    Node right;
    Node left;
    int data;
    public Node(int data) {
        this.data = data;
    }
}




