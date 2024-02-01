class Solution {
    static void placeQueens(final int queens) {
        
    }

    static void getSolution(int boardSize, List<List<String>> solutions, int[] columns, int columnIndex) {
        if (columnIndex == boardSize) {
            // this means that all queens have been placed
            List<String> sol = new ArrayList<String>();
            for (int i = 0; i < boardSize; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < boardSize; j++) {
                    sb.append(j == columns[i] ? "Q" : ".");
                }
                sol.add(sb.toString());
            }
            solutions.add(sol);
            return;
        }

        // This loop tries to place queen in a row one by one
        for (int rowIndex = 0; rowIndex < boardSize; rowIndex++) {
            columns[columnIndex] = rowIndex;
            if (isPlacedCorrectly(columns, rowIndex, columnIndex)) {
                // If queen is placed successfully at rowIndex in column=columnIndex then try
                // placing queen in next column
                getSolution(boardSize, solutions, columns, columnIndex + 1);
            }
        }
    }

    static boolean isPlacedCorrectly(int[] columns, int rowIndex, int columnIndex) {
        for (int i = 0; i < columnIndex; i++) {
            int diff = Math.abs(columns[i] - rowIndex);
            if (diff == 0 || columnIndex - i == diff) {
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int queens) {
        List<List<String>> arrangements = new ArrayList<List<String>>();
        getSolution(queens, arrangements, new int[queens], 0);
        return arrangements;
    }
}