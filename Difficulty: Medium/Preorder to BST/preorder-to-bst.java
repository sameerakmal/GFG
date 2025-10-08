// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int i = 0;

    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        i = 0;
        return helper(pre, Integer.MAX_VALUE);
    }

    private Node helper(int pre[], int bound) {
        if (i == pre.length || pre[i] > bound)
            return null;
        
        Node root = new Node(pre[i++]);
        root.left = helper(pre, root.data);
        root.right = helper(pre, bound);
        
        return root;
    }
}
