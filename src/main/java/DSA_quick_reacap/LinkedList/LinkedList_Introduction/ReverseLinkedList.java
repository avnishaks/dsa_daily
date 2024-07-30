package DSA_quick_reacap.LinkedList.LinkedList_Introduction;

public class ReverseLinkedList {
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
        ListNode newNode = new ListNode(value);
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

    public ListNode reverseList() {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        int[] A = new int[]{1, 2, 3, 4, 5, 6};
        reverseLinkedList.createLinkedList(A);
        System.out.println("Before reversing the List Node:");
        reverseLinkedList.printList();
        reverseLinkedList.reverseList();
        System.out.println("After reversing the List Node:");
        reverseLinkedList.printList();
    }
}
