class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[0][j] == target)
                    return true;
            }
            return false;
        }
            
        for(int i=0; i<matrix.length-1;i++){
            if(target == matrix[i][0])
                return true;
            if(target >= matrix[i][0] && target < matrix[i+1][0])
            {
                for(int j=0; j<matrix[i].length;j++){
                    if(matrix[i][j] == target)
                        return true;
                }
            }
        }
        for(int j=0; j<matrix[0].length;j++){
            if(matrix[matrix.length-1][j] == target)
                return true;
        }
        return false;
    }
}