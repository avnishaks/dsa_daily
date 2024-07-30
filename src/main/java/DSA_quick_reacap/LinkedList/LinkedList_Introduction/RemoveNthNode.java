package DSA_quick_reacap.LinkedList.LinkedList_Introduction;

public class RemoveNthNode {
    class ListNode{
        public int value;
        public ListNode next;
        ListNode(int x){
            value=x;
            next=null;
        }
    }
    private ListNode head;

    public void addNode(int value) {
        ListNode newNode=new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void createLinkedList(int[] A) {
        for (int x : A) {
            addNode(x);
        }
    }
    public ListNode solution(ListNode head,int A){
        ListNode temp=head;
        int count=0;
        // count the length of the LL
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        if(count==1){
            head=null;
            return head;
        }
        int pos=count-A;
        if(pos<=0){
            temp=head.next;
            head=temp;
            return head;
        }
        temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public ListNode removeBthNode(int A){
        return solution(head,A);
    }

    public static void main(String[] args) {
        RemoveNthNode removeNthNode=new RemoveNthNode();
        int [] A=new int[]{1,2,3,4,5};
        int B=2;
        removeNthNode.createLinkedList(A);
        removeNthNode.printList();
        System.out.println("After removing the Bth Node form the list is : ");
        removeNthNode.removeBthNode(B);
        removeNthNode.printList();
    }
}
