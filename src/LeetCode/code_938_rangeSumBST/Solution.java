package LeetCode.code_938_rangeSumBST;

/*
 * 给定二叉搜索树的根结点 root，
 * 返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 *
 * 示例 1：
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 *
 * 示例 2：
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 */


//import Basic.Tree.Binary_Tree_DFS;

import javax.swing.tree.TreeNode;
import java.util.Stack;

// 遍历
// 深度优先遍历
// 递归
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {

        if(root == null) return 0;
        if(root.val >= L && root.val <= R) return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        else if(root.val < L) return rangeSumBST(root.right, L, R);
        else return rangeSumBST(root.left, L, R);
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

