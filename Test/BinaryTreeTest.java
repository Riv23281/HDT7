package Test;
import org.junit.Test;

import Association;
import BinaryTree;
import TreeNode;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testInsertAndSearch() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        Association<String, String> association1 = new Association<>("house", "casa");
        Association<String, String> association2 = new Association<>("dog", "perro");

        tree.insert(association1);
        tree.insert(association2);

        TreeNode<String, String> node1 = tree.search("house");
        TreeNode<String, String> node2 = tree.search("dog");
        TreeNode<String, String> node3 = tree.search("cat");

        assertEquals(association1, node1.association);
        assertEquals(association2, node2.association);
        assertNull(node3);
    }
}
