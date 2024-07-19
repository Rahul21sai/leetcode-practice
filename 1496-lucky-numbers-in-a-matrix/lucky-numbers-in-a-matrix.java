class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> rowmin = new ArrayList<>();
        for(int i = 0 ; i< matrix.length;i++){
            int rmin = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[0].length; j++){
                rmin = Math.min(rmin,matrix[i][j]);
            }
            rowmin.add(rmin);
        }

        List<Integer> colmax = new ArrayList<>();
        for(int i= 0; i< matrix[0].length;i++){
            int cmax = Integer.MIN_VALUE;
            for(int j = 0; j< matrix.length;j++){
                cmax = Math.max(cmax,matrix[j][i]);
            }
            colmax.add(cmax);
        }

        List<Integer> lucknumbers = new ArrayList<>();
        for(int i = 0; i < matrix.length;i++){
            for(int j =0; j < matrix[0].length; j++){
                if(matrix[i][j] == rowmin.get(i) && matrix[i][j] == colmax.get(j)){
                    lucknumbers.add(matrix[i][j]);
                }
            }
        }
        return lucknumbers;
    }
}