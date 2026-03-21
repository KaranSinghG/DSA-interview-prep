class Search2DArray1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bottom = matrix.length-1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        while(top<=bottom){
            int mid = top + (bottom-top)/2;
            if(target>matrix[mid][cols-1]){
                top=mid+1;
            } else if (target<matrix[mid][0]){
                bottom = mid-1;
            } else {
                int l = 0;
                int r = cols;
                while (l<=r){
                    int m = l + (r-l)/2;
                    if(target>matrix[mid][m]){
                        l=m+1;
                    } else if (target<matrix[mid][m]){
                        r=m-1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
