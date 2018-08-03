package tree;

public class BinaryTree {

    public Node root;

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public Node getRoot() {
        return root;
    }
}