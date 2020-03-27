package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// After run this code we came to know that case one is true and case 2 is false

public class MyMain {
    public static void main(String[] args) {

        TraversalOperations t = new TraversalOperations();
        MyBinarySearchTree mst = new MyBinarySearchTree();
        TreeNode root = new TreeNode(10);
        mst.insert(root, 5);
        mst.insert(root, 1);
        mst.insert(root, 15);
        mst.insert(root, 9);
        mst.insert(root, 7);
        mst.insert(root, 12);
        mst.insert(root, 30);
        mst.insert(root, 25);
        mst.insert(root, 40);
        mst.insert(root, 45);
        mst.insert(root, 6);
        mst.insert(root, 3);
        t.printPreorder(root);
        System.out.println();
        t.printPostorder(root);
    }
}