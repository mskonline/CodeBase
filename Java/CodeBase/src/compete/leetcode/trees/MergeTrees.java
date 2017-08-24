package compete.leetcode.trees;

/**
 * @author SaiKumar
 *
 * https://leetcode.com/problems/merge-two-binary-trees/tabs/description
 */
public class MergeTrees {

	public static void main(String[] args) {
	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 != null)
            t1 = new TreeNode(0);

        mergedTrees(t1, t2);
        return t1;
    }

    public void mergedTrees(TreeNode t1, TreeNode t2){
        if(t2 == null)
            return;

        t1.val = t1.val + t2.val;

        if(t1.left == null && t2.left != null){
            t1.left = new TreeNode(0);
        }

        mergedTrees(t1.left, t2.left);

        if(t1.right == null && t2.right != null){
            t1.right = new TreeNode(0);
        }

        mergedTrees(t1.right, t2.right);
    }

    class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;

    	public TreeNode(int x){
    		val = x;
    	}
    }
}
