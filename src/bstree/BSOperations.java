/**
 * @author Vinit Kumar
 * @created on 10-01-2022
 * Binary Search Tree operations
 */
package bstree;

/**
 * calls operations for binary search tree
 */
public class BSOperations {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary search tree operations");
        //object creation
        BSTree tree = new BSTree();
        //insert operation
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        //print tree
        System.out.print("Binary Search Tree: ");
        tree.print();

    }
}
