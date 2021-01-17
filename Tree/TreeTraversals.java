package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversals {
    List<Integer> inOrderList = new ArrayList<>();
    List<Integer> preOrderList = new ArrayList<>();
    List<Integer> postOrderList = new ArrayList<>();

    public List<Integer> inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            inOrderList.add(root.val);
            inOrderTraversal(root.right);
        }
        return inOrderList;
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root != null) {
            preOrderList.add(root.val);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        return preOrderList;
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            postOrderList.add(root.val);
        }
        return postOrderList;
    }

    // type psvm and tab to generate main method in intellij or main and tab if you set up the template
    public static void main(String[] args) {
        TreeTraversals binaryTree = new TreeTraversals();
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(5);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(10);
        root.left.left.right = new TreeNode(4);
        List<Integer> inOrderList = binaryTree.inOrderTraversal(root);

        for (int nodeVal : inOrderList) {
            System.out.print(nodeVal+ "  ");
        }
        System.out.println();

        List<Integer> preOrderList = binaryTree.preOrderTraversal(root);

        for (int nodeVal : preOrderList) {
            System.out.print(nodeVal + "  ");
        }
        System.out.println();

        List<Integer> postOrderList = binaryTree.postOrderTraversal(root);

        for (int nodeVal : postOrderList) {
            System.out.print(nodeVal + "  ");
        }
    }
}
