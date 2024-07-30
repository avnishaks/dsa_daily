package DSA_quick_reacap.LinkedList.LinkedList_Introduction;

public class RemoveDuplicateFromSortedList {
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
    public ListNode removeDuplicate(){
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.value==temp.value){
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicateFromSortedList removeDuplicateFromSortedList=new RemoveDuplicateFromSortedList();
        int [] A=new int[]{1,2,2,3,4,5,5,5,6,7,7,7,7,8};
        removeDuplicateFromSortedList.createLinkedList(A);
        System.out.println("Before removing all the duplicate element from the list : ");
        removeDuplicateFromSortedList.printList();
        System.out.println("After removing all the duplicate element from the list : ");
        removeDuplicateFromSortedList.removeDuplicate();
        removeDuplicateFromSortedList.printList();
    }
}
