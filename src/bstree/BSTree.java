/**
 * @author Vinit Kumar
 * @created on 10-01-2022
 * Binary Search Tree methods
 */
package bstree;

public class BSTree<T extends Comparable> {
    //variable declaration
    private BSNode root;
    private int size=0;


    /**
     * calls insert function by passing data and root
     */
    public <T> void insert(T data) {
        root = insert(root, data);
    }

    /**
     * Recursively call insert data in root
     * traverse tree till root is null
     * compare value with root data and call left or right based on comparison
     */
    private <T> BSNode insert(BSNode BSNode, T data) {

        /**
         * If BSNode is null
         * create the BSNode and return
         */
        if (BSNode == null) {
            size++;
            return new BSNode((Comparable) data);
        }

        /**
         * if data is less than the root,
         * move data to left
         */
        if (BSNode.data.compareTo(data)>0) {
            BSNode.left = insert(BSNode.left, data);
        }

        /**
         * If data is greater than the root,
         * move data to right
         */
        if (BSNode.data.compareTo(data)<0) {
            BSNode.right = insert(BSNode.right, data);
        }
        return BSNode;
    }

    /**
     * calls print function by passing root
     */
    public void print() {
        print(root);
    }

    /**
     * prints tree using inorder traversal
     * traverse till root is not null
     * recursive call left subtree
     * print root
     * recursive call right subtree
     */
    private void print(BSNode root) {
        if (root != null) {
            //recursive call left tree
            print(root.left);
            //print value
            System.out.print(root.data + " ");
            //recursive call right
            print(root.right);
        }
    }
    /**
     * print no of nodes in Binary Search tree
     */
    public void size() {
        System.out.print("\nSize of tree is: " + size);
    }
}