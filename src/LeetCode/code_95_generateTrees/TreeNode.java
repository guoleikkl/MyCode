package LeetCode.code_95_generateTrees;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
