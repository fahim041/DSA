package datastructure;

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedList {
    ListNode left;
    ListNode right;

    public DoublyLinkedList() {
        left = new ListNode(0);
        right = new ListNode(0);
        left.next = right;
        right.prev = left;
    }

    public int get(int index) {
        ListNode curr = left.next;

        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }

        if (curr != null && curr != right && index == 0) {
            return curr.val;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        ListNode next = left.next;
        ListNode prev = left;
        prev.next = newNode;
        next.prev = newNode;
        newNode.prev = prev;
        newNode.next = next;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode next = right;
        ListNode prev = right.prev;
        prev.next = newNode;
        next.prev = newNode;
        newNode.prev = prev;
        newNode.next = next;
    }

    public void addAtIndex(int index, int val) {
        ListNode curr = left.next;
        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }

        if (curr != null && index == 0) {
            ListNode newNode = new ListNode(val);
            ListNode next = curr;
            ListNode prev = curr.prev;
            prev.next = newNode;
            next.prev = newNode;
            newNode.prev = prev;
            newNode.next = next;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode curr = left.next;
        while (curr != null && index > 0) {
            curr = curr.next;
            index -= 1;
        }
        if (curr != null && curr != right && index == 0) {
            ListNode next = curr.next;
            ListNode prev = curr.prev;
            next.prev = prev;
            prev.next = next;
        }
    }

    public void print() {
        ListNode curr = left.next;
        while (curr != right) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}