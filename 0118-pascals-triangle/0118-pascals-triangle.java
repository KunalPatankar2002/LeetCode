class Solution {
    
    static int nCr(int n, int r)
    {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public List<Integer> nextRow(int rowNum){
        List<Integer> row = new ArrayList<Integer>();
        for(int i=0; i<rowNum+1;i++){
            row.add(nCr(rowNum,i));
        }
        return row;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
            triangle.add(nextRow(i));
        }
        return triangle;
    }
}