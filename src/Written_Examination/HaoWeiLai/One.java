package Written_Examination.HaoWeiLai;

import java.util.Stack;

public class One {

    /*
     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     * }
     */


        /**
         * 二叉树的非递归前序遍历
         * @param root TreeNode类 根节点
         * @return string字符串
         */
        public String notReCuPreOrder (TreeNode root) {
            // write code here
            StringBuilder res = new StringBuilder();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode tmp = stack.pop();
                res.append(tmp.val + ",");
                if(tmp.right != null)
                    stack.push(tmp.right);
                if(tmp.left != null)
                    stack.push(tmp.left);
            }
            String result = new String(res);
            result = result.substring(0, result.length() - 1);
            return result;




        }
}
