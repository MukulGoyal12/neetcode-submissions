class Solution {
    public boolean isValidSudoku(char[][] board) {
        //row
        for(int i=0;i<9;i++){
            Set<Character> st = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(st.contains(board[i][j])){
                    return false;
                }
                st.add(board[i][j]);
            }
        }
  
        //col
        for(int i=0;i<9;i++){
            Set<Character> st = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(st.contains(board[j][i])){
                    return false;
                }
                st.add(board[j][i]);
            }
        }

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!checkBox(i,j,board))
                    return false;
            }
        }
        return true;
    }

    public boolean checkBox(int r, int c , char[][] board){
        Set<Character> st = new HashSet<>();
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(st.contains(board[i][j])){
                    return false;
                }
                st.add(board[i][j]);
            }
        }
        return true;
    }
}