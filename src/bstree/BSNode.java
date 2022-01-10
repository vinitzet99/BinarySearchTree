/**
 * @author Vinit Kumar
 * @created on 10-01-2022
 * Binary Search Tree Node
 */
package bstree;

public class BSNode<T extends Comparable> {
    public T data;
    public BSNode left;
    public BSNode right;

    BSNode(T data){
        this.data=data;
        left=null;
        right=null;
    }
}
