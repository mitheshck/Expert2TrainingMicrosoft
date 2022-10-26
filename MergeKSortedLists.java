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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null && lists.length==0) return null;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(ListNode list : lists){
            ListNode temp = list;
            while(temp!=null){
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode head = new ListNode();
        ListNode temp = head;
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return head.next;
    }
}
