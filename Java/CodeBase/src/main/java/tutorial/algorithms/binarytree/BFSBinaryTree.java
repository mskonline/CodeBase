package tutorial.algorithms.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void bfs(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(node);

        while (!queue.isEmpty()) {
            node = queue.poll();

            System.out.println(node.val);

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(9);

        bfs(root);
    }
}
