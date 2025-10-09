/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        int successor = -1;
        while(root != null){
            if(x.data >= root.data){
                root = root.right;
            }
            else{
                successor = root.data;
                root = root.left;
            }
        }
        return successor;
    }
}