class Solution {
    // Function to find all possible paths
    ArrayList<String> al;
    public ArrayList<String> ratInMaze(int[][] mat) {
        al = new ArrayList<>();
        helper(mat, 0, 0, mat.length, "");
        Collections.sort(al);
        return al;
    }
    public void helper(int[][] mat, int i, int j, int n, String path){
        if(i < 0 || j < 0 || i >= n || j >= n || mat[i][j] == 0){
            return;
        }
        if(i == n-1 && j == n-1){
            al.add(path);
            return;
        }
        mat[i][j] = 0;
        helper(mat, i, j-1, n, path + "L");
        helper(mat, i, j+1, n, path + "R");
        helper(mat, i-1, j, n, path + "U");
        helper(mat, i+1, j, n, path + "D");
        mat[i][j] = 1;
        return;
    }
    
}