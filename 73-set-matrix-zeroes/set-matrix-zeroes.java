class Solution {
    public void setZeroes(int[][] matrix) {
        int rowcount = matrix.length;
        int colcount = matrix[0].length;

        boolean[] rows = new boolean[rowcount];
        boolean[] cols = new boolean[colcount];

        boolean isEmpty = true;

        for(int i = 0; i < rowcount;i++){
            for(int j = 0; j < colcount;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                    isEmpty = false;
                
                }
            }
            
        }

        if(!isEmpty){
            for(int i = 0; i < rowcount;i++){
                for(int j = 0 ;j < colcount;j++){
                    if(rows[i] || cols[j]){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}