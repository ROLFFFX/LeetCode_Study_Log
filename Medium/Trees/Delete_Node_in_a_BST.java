package Medium.Trees;

public class Delete_Node_in_a_BST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val){
            root.left = deleteNode(root.left, key);
            return root;
        }

        else if (root.val > key){
            root.right = deleteNode(root.right, key);
            return root;
        }
        // node found, or not
        else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                TreeNode min = root.right;
                while (min.left != null){
                    min = min.left;
                }
                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
                return root;
            }
        }
    }
}
