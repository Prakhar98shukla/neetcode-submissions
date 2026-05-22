class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
        Set<Character> hSet=new HashSet<>();
           for(int i=0;i<9;i++){
            if(board[row][i]=='.') continue;
            if(hSet.contains(board[row][i])) return false;
            hSet.add(board[row][i]);
           }
        }
        for(int col=0;col<9;col++){
        Set<Character> hSet=new HashSet<>();
           for(int i=0;i<9;i++){
            if(board[i][col]=='.') continue;
            if(hSet.contains(board[i][col])) return false;
            hSet.add(board[i][col]);
           }
        }
        Set<String> hSet=new HashSet<>();
        for(int sq=0;sq<9;sq++){
           for(int i=0;i<9;i++){
            int box=(sq/3)*3+(i/3);
            String s=box+"-"+board[sq][i];
            if(board[sq][i]=='.') continue;
            if(hSet.contains(s)) return false;
            hSet.add(s);
           } 
        }
        return true;
    }
}
