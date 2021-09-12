package Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {
    }
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }
}
