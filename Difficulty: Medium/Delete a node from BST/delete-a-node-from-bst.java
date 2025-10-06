/*
class Node {
    int data;
    Node left, right;

    Node(int data) {
        data = data;
        left = right = null;
    }
}

*/

class Solution {
    Node deleteNode(Node root, int x) {
       if(root == null) return root;
        if(root.data == x) return helper(root);
        Node dummy = root;
        while(root != null){
            if(root.data > x){
                if(root.left != null && root.left.data == x){
                    root.left = helper(root.left);
                    break;
                }
                else{
                    root = root.left;
                }
            }
            else{
                if(root.right != null && root.right.data == x){
                    root.right = helper(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }
        }
        return dummy;
    }
    public Node helper(Node root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        else{
            Node rightChild = root.right;
            Node leftTreeRightMostChild = findLeftTreeRightMostChild(root.left);
            leftTreeRightMostChild.right = rightChild;
        }
        return root.left;
    }
    public Node findLeftTreeRightMostChild(Node root){
        if(root.right == null){
            return root;
        }
        return findLeftTreeRightMostChild(root.right);
    }
}