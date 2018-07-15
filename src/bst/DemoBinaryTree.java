/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author bulbul
 */
public class DemoBinaryTree {
    public static void main(String[] args) {
        
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        
        n7.left=n5;
        n7.right=n2;
        
        n9.left=n1;
        
        n6.left=n7;
        n6.right=n9;
        
        MyBinaryTree mbt = new MyBinaryTree(n6);
        
        mbt.preOrder(mbt.root);
        System.out.println();
        mbt.inOrder(mbt.root);
        System.out.println();
        mbt.postOrder(mbt.root);
    }
}
