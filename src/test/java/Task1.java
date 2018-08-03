import org.junit.Assert;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

public class Task1 {

    @Test
    public void calculateTree() {
        BinaryTree tree = new BinaryTree();
        Node root = new Node();
        //L1
        root.left = new Node();
        root.right = new Node();
        //L2
        root.left.left = new Node();
        root.left.right = new Node();
        //L3
        root.right.left = new Node();
        root.right.right = new Node();

        Assert.assertEquals(3, tree.height(root));
    }

    @Test
    public void calculateTree1() {
        BinaryTree tree = new BinaryTree();
        Node root = new Node();
        //L1
        root.left = new Node();
        root.right = new Node();
        //L2
        root.left.left = new Node();
        root.left.right = new Node();
        //L3
        root.right.left = new Node();
        root.right.right = new Node();
        //L4
        root.right.right.right = new Node();

        Assert.assertEquals(4, tree.height(root));
    }

}
