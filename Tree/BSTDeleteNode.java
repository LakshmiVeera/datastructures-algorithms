package Tree;

/* Delete the given node in a binary search tree */
class BSTDeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root != null) {
            if(key < root.val) {
                root.left = deleteNode(root.left, key);
            } else {
                root.right = deleteNode(root.right, key);
            }
            if(root.val == key){
                // verify if the node is a leaf node
                if(root.left == null && root.right == null) {
                    root = null;
                }
                // Replace it with successor if the node had only right and delete the successor recursively
                else if(root.right != null ) {
                    root.val  = getSuccessor(root);
                } else if (root.left != null) {
                    root.val = getPredecessor(root);
                }
            }
        }
        return root;
    }
    // Get the predecessor value and delete the node
    public int getSuccessor(TreeNode root) {
        int successor = 0;
        TreeNode parentNode = root;
        root = root.right;
        if(root.left == null) {
            successor = root.val;
            parentNode.right = null;
            return successor;
        }
        while(root != null && root.left != null) {
            parentNode = root;
            root = root.left;
        }

        parentNode.left = null;
        return successor;
    }
    // Get the predecessor value and delete the node
    public int getPredecessor(TreeNode root) {
        int predecessor = 0;
        TreeNode parentNode = root;
        root = root.left;
        if(root.right == null) {
            predecessor = root.val;
            parentNode.left = null;
            return predecessor;
        }
        while(root != null && root.right != null) {
            parentNode = root;
            root = root.right;
        }
        predecessor = root.val;
        parentNode.right = null;
        return predecessor;
    }

    public static void printNodes(TreeNode root) {
        if(root != null) {
            printNodes(root.left);
            System.out.println(root.val);
            printNodes(root.right);
        }
    }

    public static void main(String... args) {
        BSTDeleteNode binarySearchTree = new BSTDeleteNode();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);

        binarySearchTree.deleteNode(root, 3);
        binarySearchTree.printNodes(root);
    }
}
