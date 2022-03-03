class SearchTwoDimensionalMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        /* Search is starting from bottom-left. We could also start our search from top-right */
        int i = row - 1;
        int j = 0;
        
        while(i >= 0 && i < row && j >= 0 && j < column){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                i -= 1;
            else 
                j += 1;
        }
        
        return false;
    }
}
