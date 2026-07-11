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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return new int[]{-1, -1};
        ListNode curr= head.next;
        ListNode prev= head;
        List<Integer> crit= new ArrayList<>();
        int count=1;
        while(curr!=null&&curr.next!=null){
            if(prev!=null){
                if((curr.val>prev.val&&curr.val>curr.next.val)||(curr.val<prev.val&&curr.val<curr.next.val)){
                    crit.add(count);
                }
                prev= curr;
                curr=curr.next;
                count++;
            }
        }
        if(crit.size()<2) return new int[]{-1, -1};
        int minD=Integer.MAX_VALUE;
        int maxD= crit.get(crit.size()-1)-crit.get(0);
        for(int i=1; i<crit.size(); i++){
            minD= Math.min(minD, crit.get(i)-crit.get(i-1));
        }
        return new int[] {minD, maxD};
    }
}