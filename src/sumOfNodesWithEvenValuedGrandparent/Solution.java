package sumOfNodesWithEvenValuedGrandparent;

public class Solution {
    int ans=0;
    public int sumEvenGrandparent(TreeNode root) {
        ans=check(root);
        return ans;
    }
    public int check(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.val%2==0){
            if(root.left!=null){
                if(root.left.left!=null){
                    ans+=root.left.left.val;
                }
                if(root.left.right!=null){
                    ans+=root.left.right.val;
                }
            }
            if(root.right!=null){
                if(root.right.left!=null){
                    ans+=root.right.left.val;
                }
                if(root.right.right!=null){
                    ans+=root.right.right.val;
                }
            }
        }
        check(root.left);
        check(root.right);
        return ans;
    }
}
