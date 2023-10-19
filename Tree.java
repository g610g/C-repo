public class Tree {
    public TreeNode root;
    Tree()
    {
        root = null;
    }
    public void insertNode(TreeNode node)
    {
        if(root == null)
        {
            root = node;
            return;
        }
        this.insertNodeBstRecursive(node, root);
    }
    private void insertNodeRecursive(TreeNode node, TreeNode treeRoot)
    {
        if (treeRoot.left == null)
        {
            treeRoot.left = node;
            return;
        }
        else if (treeRoot.right == null)
        {
            treeRoot.right = node;
            return;
        }
        
    }
    private void insertNodeBstRecursive(TreeNode node, TreeNode treeRoot)
    {
        if (node.value < treeRoot.value)
        {
            
            if (treeRoot.left != null)
            {
                insertNodeBstRecursive(node, treeRoot.left);
                return;
            }
            treeRoot.left = node;
            return;
        }
        else if (node.value > treeRoot.value)
        {
            if (treeRoot.right != null)
            {
                insertNodeBstRecursive(node, treeRoot.right);
                return;
            }
            treeRoot.right = node;
            return;
        }

    }
    public void printTree(TreeNode root)
    {
        if (root == null)
        {
            // System.out.println("Test");
            return;
        }
        printTree(root.left);
        System.out.println(root.value);
        printTree(root.right);
        return;
    }
    public void dfs(TreeNode root, int level)
    {
        if (root == null)
        {
            return;
        }
        System.out.println("node value: " +  root.value + "  Level: "  + level);
        dfs(root.left, level + 1);
        dfs(root.right,level + 1);
        return;
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] nodeValueArr = {10,30,7,5,8,4};
        for(int value : nodeValueArr)
        {
            TreeNode node = new TreeNode(value);
            tree.insertNode(node);
        }
        // tree.printTree(tree.root);
        tree.dfs(tree.root, 0);
    }
}
