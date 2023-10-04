package datastructure;

public class BST {
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insert(root.right, val);
        } else if (val < root.val) {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public TreeNode getMinNode(TreeNode root) {
        TreeNode curr = root;
        while (curr != null && curr.left != null) {
            curr = root.left;
        }

        return curr;
    }

    public TreeNode remove(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.val) {
            root.left = remove(root.left, val);
        } else if (val > root.val) {
            root.right = remove(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode minNode = getMinNode(root.right);
                root.val = minNode.val;
                root.right = remove(root.right, minNode.val);
            }
        }

        return root;
    }
}
