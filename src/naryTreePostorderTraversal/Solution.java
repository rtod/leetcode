package naryTreePostorderTraversal;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node g1 = new Node(5, new ArrayList<>());
        Node g2 = new Node(6, new ArrayList<>());

        List<Node> gs = new ArrayList<>();
        gs.add(g1);
        gs.add(g2);

        Node c1 = new Node(3, gs);
        Node c2 = new Node(2, new ArrayList<>());
        Node c3 = new Node(4, new ArrayList<>());

        List<Node> cs = new ArrayList<>();
        cs.add(c1);
        cs.add(c2);
        cs.add(c3);

        Node root = new Node(1, cs);

        System.out.println(solution.postorder(root));
    }

    public List<Integer> postorder(Node root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            ans.add(root.val);
            for (Node child : root.children)
                stack.push(child);
        }

        Collections.reverse(ans);
        return ans;
    }
}
