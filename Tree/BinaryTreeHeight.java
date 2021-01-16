package Tree;

public class BinaryTreeHeight {
    public int getHeight(TreeNode root) {
        int leftVal = 0;
        int rightVal = 0;
        if(root != null) {
            if(root.left != null) {
                leftVal = getHeight(root.left) + 1;
            }
            if(root.right != null) {
                rightVal = getHeight(root.right) + 1;
            }
        }
        return Math.max(leftVal, rightVal);
    }
    public static void main(String... args) {
        BinaryTreeHeight binaryTree = new BinaryTreeHeight();
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.left.left = new TreeNode(11);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(13);
        root.left.left.left = new TreeNode(10);

        System.out.println(binaryTree.getHeight(root));
    }

    public class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;
        public TreeNode(){}
        public TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode right, TreeNode left) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
