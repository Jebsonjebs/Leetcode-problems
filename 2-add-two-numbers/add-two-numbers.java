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
    static ListNode head,tail;
    private void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println();
    }
    private void insert(ListNode node){
        if(head==null) head=tail=node;
        else{
            tail.next=node;
            tail=tail.next;
            tail.next=null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        head=tail=null;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        ListNode nl=new ListNode();
        while(temp1 != null || temp2 != null || carry != 0)
        {
            int sum=carry;
            if(temp1 != null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2 != null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
            System.out.println(sum%10);

            carry=sum/10;
         insert( new ListNode(sum%10,null));


        }
        printList(head);
        return head;
    
    }
}