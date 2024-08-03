package DSA_quick_reacap.Heap.Introduction;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode mergeKLists(ArrayList<ListNode> a) {
        if (a == null || a.size() == 0) {
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);

        // Add the first node of each list to the min heap
        for (ListNode node : a) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;

            if (minNode.next != null) {
                minHeap.add(minNode.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode ls1 = new ListNode(1);
        ls1.next = new ListNode(10);
        ls1.next.next = new ListNode(20);

        System.out.println("Value of the List Node 1: " + ls1.val + " " + ls1.next.val + " " + ls1.next.next.val);

        ListNode ls2 = new ListNode(4);
        ls2.next = new ListNode(11);
        ls2.next.next = new ListNode(13);

        System.out.println("Value of the List Node 2: " + ls2.val + " " + ls2.next.val + " " + ls2.next.next.val);

        ListNode ls3 = new ListNode(3);
        ls3.next = new ListNode(8);
        ls3.next.next = new ListNode(9);

        System.out.println("Value of the List Node 3: " + ls3.val + " " + ls3.next.val + " " + ls3.next.next.val);

        ArrayList<ListNode> arrayList = new ArrayList<>();
        arrayList.add(ls1);
        arrayList.add(ls2);
        arrayList.add(ls3);

        ListNode combined = mergeKLists(arrayList);

        System.out.print("Merged List: ");
        while (combined != null) {
            System.out.print(combined.val + " ");
            combined = combined.next;
        }
        System.out.println();
    }
}
