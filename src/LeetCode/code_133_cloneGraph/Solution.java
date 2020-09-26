package LeetCode.code_133_cloneGraph;

/*
给你无向 连通 图中一个节点的引用，请你返回该图的 深拷贝（克隆）。

图中的每个节点都包含它的值 val（int） 和其邻居的列表（list[Node]）。

class Node {
    public int val;
    public List<Node> neighbors;
}
 

测试用例格式：

简单起见，每个节点的值都和它的索引相同。例如，第一个节点值为 1（val = 1），第二个节点值为 2（val = 2），以此类推。该图在测试用例中使用邻接列表表示。

邻接列表 是用于表示有限图的无序列表的集合。每个列表都描述了图中节点的邻居集。

给定节点将始终是图中的第一个节点（值为 1）。你必须将 给定节点的拷贝 作为对克隆图的引用返回。

 */

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 不会
 * 看题解
 * 深度优先搜索
 */

public class Solution {

    private HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node){

        if(node == null){
            return node;
        }

        // 如果该节点已经被访问过了，则直接从哈希表中取出对应的克隆节点返回
        if(visited.containsKey(node)){
            return visited.get(node);
        }

        // 克隆节点，注意到为了深拷贝我们不会克隆它的邻居节点的列表
        Node cloneNode = new Node(node.val, new ArrayList<>());
        // 哈希表存储
        visited.put(node, cloneNode);

        // 遍历该节点的邻居并更新克隆节点的邻居列表
        for(Node neighbor : node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;

    }

}
