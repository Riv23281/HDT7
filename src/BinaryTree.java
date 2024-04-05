public class BinaryTree<K extends Comparable<K>, V> {
    TreeNode<K, V> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(Association<K, V> association) {
        root = insertRecursive(root, association);
    }

    private TreeNode<K, V> insertRecursive(TreeNode<K, V> root, Association<K, V> association) {
        if (root == null) {
            root = new TreeNode<>(association);
            return root;
        }

        if (association.key.compareTo(root.association.key) < 0)
            root.left = insertRecursive(root.left, association);
        else if (association.key.compareTo(root.association.key) > 0)
            root.right = insertRecursive(root.right, association);

        return root;
    }

    public void inorderTraversal(TreeNode<K, V> root, String language) {
        if (root != null) {
            inorderTraversal(root.left, language);
            System.out.print(root.association.key + " " + root.association.value);
            if (language.equals("spanish")) {
                System.out.print(" " + root.association.value);
            } else if (language.equals("french")) {

            }
            System.out.println();
            inorderTraversal(root.right, language);
        }
    }

    public TreeNode<K, V> search(K key) {
        return searchRecursive(root, key);
    }

    private TreeNode<K, V> searchRecursive(TreeNode<K, V> root, K key) {
        if (root == null || root.association.key.equals(key))
            return root;

        if (key.compareTo(root.association.key) < 0)
            return searchRecursive(root.left, key);

        return searchRecursive(root.right, key);
    }
}
