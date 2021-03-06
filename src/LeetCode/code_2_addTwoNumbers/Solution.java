package LeetCode.code_2_addTwoNumbers;


/*
给出两个 非空 的链表用来表示两个非负的整数。
其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

 */
public class Solution {

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution ss = new Solution();
        ListNode re = ss.addTwoNumbers(l1, l2);
        System.out.println(re.val);
        System.out.println(re.next.val);
        System.out.println(re.next.next.val);
    }



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null){
            return null;
        }


        int con1 = 0;
        int con2 = 0;
        double sum1 = 0;
        double sum2 = 0;
        while(l1 != null){
            sum1 += Math.pow(10,con1) * l1.val;
            con1++;
            l1 = l1.next;
        }
        while(l2 != null){
            sum2 += Math.pow(10,con2) * l2.val;
            con2++;
            l2 = l2.next;
        }

        double sum = sum1 + sum2;

//        System.out.println(sum);

        // 将结果的每位都分开
        int ssum = (int)sum;

        ListNode result = new ListNode(0);
        ListNode re = result.next;
        while(ssum>0){
            re = new ListNode(ssum%10);
            ssum = ssum/10;
            re = re.next;
        }

        result = result.next;



        return result;
    }
}
