class Solution {
    public void solveSudoku(char[][] board) {
        int arr[][] = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j] == '.') arr[i][j] = 0;
                else arr[i][j] = board[i][j] - '0';

            }
        }
        Solve(arr);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = (char) (arr[i][j] + '0');
            }
        }
    }
    static boolean Solve(int arr[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(arr[i][j]==0){
                    for(int num=1;num<=9;num++){
                        if(isSafe(arr,i,j,num)){
                            arr[i][j]=num;
                            if(Solve(arr)){
                                return true;
                            }
                            arr[i][j]=0;
                        }
                    }
                    return false;
                    
                }
            }
        }
        return true;
    }
    static boolean isSafe(int arr[][],int row,int col,int num){
        for(int i=0;i<9;i++){
            if(arr[row][i]==num || arr[i][col]==num)return false;
        }
        int startRow=row-row%3;
        int startCol=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[startRow+i][startCol+j]==num)return false;
            }
        }
        return true;
    }
}