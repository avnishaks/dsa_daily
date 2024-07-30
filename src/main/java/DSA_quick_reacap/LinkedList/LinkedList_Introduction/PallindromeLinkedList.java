package DSA_quick_reacap.LinkedList.LinkedList_Introduction;

public class PallindromeLinkedList {
    class ListNode{
        public int value;
        public ListNode next;
        ListNode(int x){
            value=x;
            next=null;
        }
    }
    private ListNode head,temp=head;

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
    boolean validate(ListNode head){
        if(head==null) return true;
        boolean ans=validate(head.next) & (head.value==temp.value);
        /*
        validate(1) [temp: 1]
 ├── validate(2) [temp: 1]
 │   ├── validate(2) [temp: 1]
 │   │   ├── validate(1) [temp: 1]
 │   │   │   ├── validate(null) → true
 │   │   │   └── return true (1 == 1) [temp: 2]
 │   │   └── return true (2 == 2) [temp: 2]
 │   └── return true (2 == 2) [temp: 1]
 └── return true (1 == 1) [temp: null]

         */
        temp=temp.next;
        return ans;
    }

    public int palindrome(){
        temp=head;
        if(validate(head)){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        PallindromeLinkedList pallindromeLinkedList=new PallindromeLinkedList();
        int[] A = new int[]{1,2,3,3,2,1};
        pallindromeLinkedList.createLinkedList(A);
        System.out.println("0 denotes Not pallindrome , while 1 denotes pallindrome");
        System.out.println("Final Answer for the above question is : "+pallindromeLinkedList.palindrome());
    }
}
