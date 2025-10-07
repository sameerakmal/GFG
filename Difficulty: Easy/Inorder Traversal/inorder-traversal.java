/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(curr != null){
            if(curr.left == null){
                ans.add(curr.data);
                curr = curr.right;
            }
            else{
                Node rightMost = findLeftSubtreeRightMostNode(curr.left, curr);
                if(rightMost.right == null){
                    rightMost.right = curr;
                    curr = curr.left;
                }
                else{
                    rightMost.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
    private Node findLeftSubtreeRightMostNode(Node left, Node curr) {
        while (left.right != null && left.right != curr) {
            left = left.right;
        }
        return left;
    }
}