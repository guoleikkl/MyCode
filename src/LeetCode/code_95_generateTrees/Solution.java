package LeetCode.code_95_generateTrees;

/*
 * 给定一个整数 n，
 * 生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 *
 * 示例：
 * 输入：3
 * 输出：
 * [
 *  [1,null,3,2],
 *  [3,2,null,1],
 *  [3,1,null,null,2],
 *  [2,1,3],
 *  [1,null,2,null,3]
 * ]
 */

/*
 * 以每个数字为根节点
 */

// 递归
// 分治
import java.util.*;




public class Solution {

    public static void main(String[] args){


        Solution ss = new Solution();

        ss.generateTrees(3);




    }





    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        // 判断输入的值是否是0
        if (n == 0) {
            return list;
        }

        return calculation(0,n);
    }

    public static List<TreeNode> calculation(int left,int right){

        List<TreeNode> list = new ArrayList<TreeNode>();

        // 没有数字，将null放入数组
        if(left>right){
            list.add(null);
            return list;
        }

        // 只有一个数字，加入数组
        if(left == right){
            list.add(new TreeNode(left));
            return list;
        }

        // 开始循环，求出所有情况
        for (int i = left; i <= right; i++) {

            // 求出左子树的所有情况
            List<TreeNode> leftTrees = calculation(left,i-1);
            // 求出右子树的所有情况
            List<TreeNode> rightTrees = calculation(i+1,right);

            // 将左右子树的所有情况汇总
            for(TreeNode leftTree : leftTrees){
                for(TreeNode rightTree : rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left = leftTree;
                    root.right = rightTree;

                    list.add(root);
                }
            }
        }

        return list;


    }


}
