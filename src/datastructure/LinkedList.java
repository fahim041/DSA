package datastructure;

import com.sun.tools.jconsole.JConsoleContext;

public class LinkedList {
    private class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode head;
    public ListNode tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public void insertEnd(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            tail = head;
        }

        tail.next = newNode;
        tail = tail.next;
    }

    public void removeEnd(){
        if(head == null){
            System.out.println("No items in the linked list to delete");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }

        tail = curr;
        tail.next = null;
    }

    public void removeAt(int index){
        if(head == null){
            return;
        }

        if(index == 0){
            ListNode tmp = head;
            head = head.next;
            tmp.next = null;
            return;
        }

        int i = 1;
        ListNode curr = head;
        while(i < index && curr != null){
            i++;
            curr = curr.next;
        }

        if(curr != null && curr.next != null){
            if(curr.next == tail){
                tail = curr;
            }

            curr.next = curr.next.next;
        }
    }

    public void removeStart(){
        if(head == null){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        ListNode tmp = head;
        head = head.next;
        tmp.next = null;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
        }

        ListNode curr = head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
