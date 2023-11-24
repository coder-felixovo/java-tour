package datastructure.tree;

/**
 * Tree: parent node representation
 */
public class ParentNodeRepresentation<E> {

    static class TreeNode<T> {
        T data;
        int parent; // parent node index

        public TreeNode() {}

        public TreeNode(T data) {
            this.data = data;
        }

        public TreeNode(T data, int parent) {
            this.data = data;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", parent=" + parent +
                    '}';
        }
    }

    private TreeNode[] nodeList; // Stores tree nodes
    private int capacity;
    private int count; // Number of tree nodes

    /**
     * Constructs an empty tree.
     * @param size the capacity of the container
     */
    ParentNodeRepresentation(int size) {
        this.nodeList = new TreeNode[size];
        this.capacity = size;
    }

    /**
     * Returns whether tree is empty.
     * @return boolean
     */
    public boolean isEmpty() {
        return nodeList[0] == null;
    }

    /**
     * Returns the root node.
     * @return
     */
    public TreeNode<E> root() {
        return nodeList[0];
    }

    /**
     * Gets tree node by the specified index.
     * @param index
     * @return
     */
    public TreeNode<E> getNodeByIndex(int index) {
        return nodeList[index];
    }

    /**
     * Returns the index of the first occurrence of the node value. If not, returns -1.
     * @param val
     * @return
     */
    public int pos(E val) {
        for (int i = 0; i < capacity; i++) {
            if (val == nodeList[i].data) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param element
     * @param parent
     */
    public void addNode(E element, int parent) {
        for (int i = 0; i < capacity; i++) {
            if (nodeList[i] == null) {
                TreeNode newNode = new TreeNode(element, parent);
                nodeList[i] = newNode;
                count++;
                return;
            }
        }
        throw new RuntimeException("Tree is full");
    }


}
