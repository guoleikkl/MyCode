package LeetCode.code_2_addTwoNumbers;

/*
 * 不能将两个数组化成整数后在计算
 * 会导致int溢出
 */
public class Solution_1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
        while(p!=null || q!=null){
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(p != null)   p = p.next;
            if(q != null)   q = q.next;
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
