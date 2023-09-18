class Solution {
    public void setZeroes(int[][] matrix) {
      int[]locx = new int[matrix.length];
      int[]locy = new int[matrix[0].length];
     
      for(int i = 0 ; i<matrix.length; i++){
        for(int j = 0 ; j<matrix[i].length; j++){
          if(matrix[i][j] == 0){
            locx[i]=1;
            locy[j]=1;
          }
        }
      }
      for(int i = 0 ; i<matrix.length; i++){
        for(int j = 0 ; j<matrix[i].length; j++){
          if(locx[i]==1 || locy[j]==1){
            matrix[i][j]=0;
          }
        }
      }
      
      
    }
}