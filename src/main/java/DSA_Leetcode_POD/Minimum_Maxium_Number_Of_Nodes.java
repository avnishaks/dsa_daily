package DSA_Leetcode_POD;


import java.util.LinkedList;

public class Minimum_Maxium_Number_Of_Nodes {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    ListNode head;
    public void insertData(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
        }
        else{
            ListNode currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
    }
    public int[] nodesBetweenCriticalSection(ListNode head){
        ListNode pre = head;
        ListNode cur = head.next;
        int[] ans = {-1, -1};
        int prePosition = -1, curPosition = -1, firstPosition = -1, position = 0;
        while (cur.next != null) {
            if ((cur.val < pre.val && cur.val < cur.next.val) || (cur.val > pre.val && cur.val > cur.next.val)) {

                prePosition = curPosition;
                curPosition = position;
                if (firstPosition == -1) {
                    firstPosition = position;
                }
                if (prePosition != -1) {
                    if (ans[0] == -1) ans[0] = curPosition - prePosition;
                    else ans[0] = Math.min(ans[0], curPosition - prePosition);
                    ans[1] = position - firstPosition;
                }
            }

            position++;
            pre = cur;
            cur = cur.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        Minimum_Maxium_Number_Of_Nodes list=new Minimum_Maxium_Number_Of_Nodes();
        list.insertData(5);
        list.insertData(3);
        list.insertData(1);
        list.insertData(2);
        list.insertData(5);
        list.insertData(1);
        list.insertData(2);
        int [] arr=new int[2];
        arr= list.nodesBetweenCriticalSection(list.head);
        System.out.println("The maximum and minimum Number of nodes b/w critical sections : "+arr[0]+" "+ arr[1]);
    }
}
