/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = null;
        ListNode currentHead = null;

        while(list1 != null && list2 != null){
            if (newHead == null){
                if (list1.val < list2.val){
                    newHead = list1;
                    currentHead = newHead;
                    list1 = list1.next;
                }else{
                    newHead = list2;
                    currentHead = newHead;
                    list2 = list2.next;
                }
            }else{
                if (list1.val < list2.val){
                    currentHead.next = list1;
                    currentHead = currentHead.next;
                    list1 = list1.next;
                }else{
                    currentHead.next = list2;
                    currentHead = currentHead.next;
                    list2 = list2.next;
                }
            }
        }
        while(list1 != null){
            if (newHead == null){
                currentHead = list1;
                newHead = currentHead;
                list1 = list1.next;
            }else{
            currentHead.next = list1;
            currentHead = currentHead.next;
            list1 = list1.next;
            }
        }
        while(list2 != null){
            if (newHead == null){
                currentHead = list2;
                newHead = currentHead;
                list2 = list2.next;
            }else{
                currentHead.next = list2;
                currentHead = currentHead.next;
                list2 = list2.next;
            }
        }

        return newHead;

    }
}
