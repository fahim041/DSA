package leetcode.linked_list;

class ListNode {
    String url;
    ListNode back;
    ListNode forward;

    public ListNode(String url) {
        this.url = url;
        back = null;
        forward = null;
    }
}

public class l_1472_design_browser_history {
    ListNode head;
    ListNode current;

    public l_1472_design_browser_history(String homepage) {
        head = new ListNode(homepage);
        current = head;
    }

    public void visit(String url) {
        ListNode newNode = new ListNode(url);
        newNode.back = current;
        current.forward = newNode;
        current = current.forward;
    }

    public String back(int steps) {
        while (current.back != null && steps > 0) {
            current = current.back;
            steps--;
        }

        return current.url;
    }

    public String forward(int steps) {
        while (current.forward != null && steps > 0) {
            current = current.forward;
            steps--;
        }
        return current.url;
    }
}
