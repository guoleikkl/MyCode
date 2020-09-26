package Written_Examination.HaoWeiLai;

public class Two {
    public static class ListNode {
        int val;
        ListNode next = null;
    }

    /**
     * 逆序
     * @param head ListNode类 头结点
     * @return ListNode类
     */
    public static ListNode reverseList (ListNode head) {
        // write code here
        if(head.next == null || head.next.next == null){
            return head;
        }
        ListNode tmp = head;
        ListNode res = null;

        while(tmp != null){
            ListNode next = tmp.next;
            tmp.next = res;
            res = tmp;
            tmp = next;
        }
        return res;


//        ListNode result = null;
//
//
//        while(head.next != null){
//            ListNode tmp = null;
//            tmp.val = head.next.val;
////            tmp.next = head.next.next;
//            head = head.next;
//
//        }
//        return result;



//        ListNode next = head.next;
//        ListNode next_next = head.next.next;
//
//        ListNode t = new ListNode();
//
//        t.val = next.val;
//
//        while(next_next != null){
//            ListNode tt = new ListNode();
//            tt.val = next_next.val;
//            tt.next = t;
//
//
//        }



//        while(next_next != null){
//            tmp = next_next.next;
//            next_next.next = next;
//            next = next_next;
//            next_next = tmp;
//        }
//
//        head.next.next = null;
//        head.next = next;
//        return head;


    }

    public static void main(String[] args){
        ListNode head = null;
        head.next.val = 1;
        head.next.next.val = 2;
        head.next.next.next.val = 3;
        head.next.next.next.next.val= 4;


        ListNode ll = reverseList(head);
        while(ll.next != null){
            System.out.println(ll.val);
            ll = ll.next;
        }
    }
}