package Basic.Tree;

//import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


//二叉树的深度优先遍历
public class Binary_Tree_DFS {

    public List<Integer> dfs(TreeNode root){
        Stack<TreeNode> stack=new Stack<TreeNode>();
        List<Integer> list=new LinkedList<Integer>();

        if(root==null)
            return list;
        //压入根节点
        stack.push(root);
        //然后就循环取出和压入节点，直到栈为空，结束循环
        while (!stack.isEmpty()){
            TreeNode t=stack.pop();
            if(t.right!=null)
                stack.push(t.right);
            if(t.left!=null)
                stack.push(t.left);
            list.add(t.val);
        }
        return  list;
    }



    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
