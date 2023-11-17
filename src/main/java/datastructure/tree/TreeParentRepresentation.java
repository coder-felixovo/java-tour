package datastructure.tree;
import org.apache.commons.lang3.ObjectUtils;

public class TreeParentRepresentation<E> {

    TreeNode[] arr = null;

    static class TreeNode<E> {
        E data; // 数据域
        int parent; // 父节点索引

        public TreeNode(E data, int parent) {
            this.data = data;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "TreeParentNode{" +
                    "data=" + data +
                    ", parent=" + parent +
                    '}';
        }
    }

    /**
     * constructor
     * @param size the number of nodes of a tree
     * @param rootData the data of the root node
     */
    TreeParentRepresentation(int size, E rootData) {
        this.arr = new TreeNode[size];
        TreeNode<E> node = new TreeNode<E>(rootData, -1);
        this.arr[0] = node;
    }

    private void checkParentNodeIsExist(int parent) {
        if (ObjectUtils.isEmpty(this.arr[parent])) {
            throw new Error("Unknown parent node.");
        }
    }

    /**
     *
     * @param data
     * @param parent the index of parent node
     */
    public void push(E data, int parent) {
        this.checkParentNodeIsExist(parent);
    }

}
