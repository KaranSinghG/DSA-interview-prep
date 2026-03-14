class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowSet = new boolean[9][10];
        boolean[][] columnSet = new boolean[9][10];
        boolean[][] boxSet = new boolean[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val = board[i][j];
                if(val != '.'){
                    int value = val-'0';
                    if(rowSet[i][value]){
                        return false;
                    } else {
                        rowSet[i][value]=true;
                    }
                    if(columnSet[j][value]){
                        return false;
                    }else {
                        columnSet[j][value]=true;
                    }
                    if(boxSet[(i/3)*3+(j/3)][value]){
                        return false;
                    }else {
                        boxSet[(i/3)*3+(j/3)][value]=true;
                    }
                }
            }
        }
        return true;
    }
}
