package Test;
import org.junit.Test;

import Association;
import TreeNode;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void testTreeNodeConstructor() {
        Association<String, String> association = new Association<>("house", "casa");
        TreeNode<String, String> treeNode = new TreeNode<>(association);
        assertEquals(association, treeNode.association);
        assertNull(treeNode.left);
        assertNull(treeNode.right);
    }
}
