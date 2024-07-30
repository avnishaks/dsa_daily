package DSA_quick_reacap.LinkedList.LinkedList_Introduction;

public class KReverseLinkedList {
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

    public void printListFinal(ListNode head) {
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
    public ListNode solution(ListNode head,int B){
        ListNode current=head;
        ListNode nextNode=null;
        ListNode prevNode=null;
        int count=0;
        while(current!=null && count<B){
            nextNode=current.next;
            current.next=prevNode;
            prevNode=current;
            current=nextNode;
            count++;
        }
        if(nextNode!=null){
            head.next=solution(nextNode,B);
        }
        return prevNode;
    }
    public ListNode KReverseNode(int B){
        return solution(head,B);
    }
    public static void main(String[] args) {
        KReverseLinkedList kReverseLinkedList=new KReverseLinkedList();
        int [] A=new int[]{1, 2, 3, 4, 5, 6};
        int B=2;
        kReverseLinkedList.createLinkedList(A);
        kReverseLinkedList.printList();
        ListNode temp=kReverseLinkedList.KReverseNode(B);
        kReverseLinkedList.printListFinal(temp);

    }
}
