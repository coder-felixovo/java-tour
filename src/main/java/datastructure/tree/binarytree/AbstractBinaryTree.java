package datastructure.tree.binarytree;

public abstract class AbstractBinaryTree {
    int count = 0;
    public abstract BinaryTreeNode find(int value);
    public abstract boolean add(int value);
    public abstract boolean remove(int value);
    public int getCount() {
        return this.count;
    }
}
