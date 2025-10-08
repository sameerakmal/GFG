/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean helper(Node root, long minVal, long maxVal) {
        if (root == null)
            return true;
        
        if (root.data <= minVal || root.data >= maxVal)
            return false;
        
        return helper(root.left, minVal, root.data) && helper(root.right, root.data, maxVal);
    }
}
