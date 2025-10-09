/* BST Node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node pre = null, suc = null;
        Node curr = root;
        
        while (curr != null) {
            if (key < curr.data) {
                suc = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        curr = root;
        while (curr != null) {
            if (key > curr.data) {
                pre = curr;
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        ArrayList<Node> result = new ArrayList<>();
        result.add(pre);
        result.add(suc);
        return result;
    }
}
