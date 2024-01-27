class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0;i<r;i++){
           for(int j = i + 1;j<c;j++){
               // swap for transpose 
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
        }

        // reverse matrix;
        for(int i=0;i<r;i++){
            int left = 0;
            int right =c-1;

            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];;
                matrix[i][right]= temp;
                left++;
                right--;
            }

               
           }
        }
    }