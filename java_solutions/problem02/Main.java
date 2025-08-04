
public class Main {
  public static void main(String[] args) {
    System.out.println("L1");
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    printListNode(l1);

    System.out.println("L2");
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    printListNode(l2);

    System.out.println("Solution");
    Solution solution = new Solution();
    ListNode result = solution.addTwoNumbers(l1, l2);
    printListNode(result);

  }

  public static void printListNode(ListNode node) {
    while (node != null) {
      System.out.print(node.val);
      if (node.next != null) System.out.print(" -> ");
      node = node.next;
    }
    System.out.println();
  }
}
