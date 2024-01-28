class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral =  new ArrayList<>();
        
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = c-1;
        int top = 0;
        int bottom = r-1;

        while(left <= right && top <= bottom){
            // left to right
            for(int j=left;j<=right;j++){
                spiral.add(matrix[top][j]);
             }  
              top++;
            
            // top to bottom
            for(int i=top;i<=bottom;i++){
                spiral.add(matrix[i][right]);
             } 
               right--;
            
            // right to left
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    spiral.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}