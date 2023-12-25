package datastructure.tree.binarytree;

public class BinaryTree extends AbstractBinaryTree{
    private BinaryTreeNode root;

    public BinaryTree() {};

    public BinaryTree(BinaryTreeNode node) {
        this.root = node;
    }

    @Override
    public BinaryTreeNode find(int value) {
        return null;
    }

    @Override
    public boolean add(int value) {
        BinaryTreeNode newNode = new BinaryTreeNode(value);

        if (this.root == null) {
            this.root = newNode;
            return true;
        }

        BinaryTreeNode cur = this.root;
        while (cur != null) {

        }

        return true;
    }

    @Override
    public boolean remove(int value) {
        return false;
    }
}
