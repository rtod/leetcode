package sumOfNodesWithEvenValuedGrandparent;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode();
        root.val = 6;
        root.left = new TreeNode(7,
                new TreeNode(2,
                        new TreeNode(9),
                        new TreeNode(0)),
                new TreeNode(7,
                        new TreeNode(1),
                        new TreeNode(4)));

        root.right = new TreeNode(8,
                new TreeNode(1),
                new TreeNode(3,
                        new TreeNode(0),
                        new TreeNode(5)));

        System.out.println(solution.sumEvenGrandparent(root));
    }
}
