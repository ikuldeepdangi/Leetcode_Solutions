class Solution {
    public void setZeroes(int[][] matrix) {
        int row = 0, col=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] ==0){
                    if(i==0)
                        row=1;
                    if(j==0)
                        col=1;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0] ==0){
                for(int j=1;j<matrix[i].length;j++)
                    matrix[i][j] = 0;    
            }
        }

        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i] ==0){
                for(int j=1;j<matrix.length;j++)
                    matrix[j][i] = 0;    
            }
        }

        if(row==1){
            for(int i=0;i<matrix[0].length;i++)
                matrix[0][i] = 0;
        }
        if(col==1){
            for(int i=0;i<matrix.length;i++)
                matrix[i][0] = 0;
        }
    }
}