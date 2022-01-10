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
        tree.insert(22);
        tree.insert(40);
        tree.insert(11);
        tree.insert(16);
        tree.insert(3);
        tree.insert(60);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);
        tree.insert(95);
        //print tree
        System.out.print("Binary Search Tree: ");
        tree.print();
        //print size
        tree.size();

    }
}
