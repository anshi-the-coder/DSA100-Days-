class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    zeroRows.add(r);
                    zeroCols.add(c);
                }
            }
        }

        for (int r : zeroRows) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = 0;
            }
        }

        for (int c : zeroCols) {
            for (int r = 0; r < rows; r++) {
                matrix[r][c] = 0;
            }
        }
    }
}