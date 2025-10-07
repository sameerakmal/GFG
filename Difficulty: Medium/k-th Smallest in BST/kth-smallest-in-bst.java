// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        int cnt = 0;
        Node curr = root;
        while(curr != null){
            if(curr.left == null){
                cnt++;
                if(cnt == k) return curr.data;
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
                    cnt++;
                    if (cnt == k) return curr.data;
                    curr = curr.right;
                }
            }
        }
        return -1;
    }
    public Node findLeftSubtreeRightMostNode(Node left, Node curr){
        while (left.right != null && left.right != curr) {
            left = left.right;
        }
        return left;
        
    }
}