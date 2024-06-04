package addTwoNumbers;

public class Main {
    public static void main(String[] args) {
        AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        printListNodes(solution.addTwoNumbers(node1, node2));
    }

    public static void printListNodes(ListNode listNode) {
        System.out.print(listNode.val);
        if (listNode.next != null) {
            printListNodes(listNode.next);
        }
    }
}
