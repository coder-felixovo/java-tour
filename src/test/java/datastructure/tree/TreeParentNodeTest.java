package datastructure.tree;

public class TreeParentNodeTest {
    public static void main(String[] args) {
//        System.out.println(Character.toString((char)65));
//        TreeParentNode<String>[] arr = new TreeParentNode[10];
//
//        for (int i = 0; i < 10; i++) {
//            TreeParentNode<String> node = new TreeParentNode<>();
//        }

        TreeParentRepresentation<String> treeParentRepresentation = new TreeParentRepresentation<String>(10, "A");
        System.out.println(treeParentRepresentation.arr[0]);
    }
}
