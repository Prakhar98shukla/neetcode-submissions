class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rowMap=new HashMap<>();
        Map<Integer,Set<Character>> colMap=new HashMap<>();
        Map<String,Set<Character>> squarMap=new HashMap<>();

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                 String sqKey= (row/3)+","+(col/3);
                 if(board[row][col]=='.') continue;
                 if(rowMap.computeIfAbsent(row,k->new HashSet<>()).contains(board[row][col])||
                    colMap.computeIfAbsent(col,k->new HashSet<>()).contains(board[row][col]) ||
                    squarMap.computeIfAbsent(sqKey, k->new HashSet<>()).contains(board[row][col])
                ) return false;

                rowMap.get(row).add(board[row][col]);
                colMap.get(col).add(board[row][col]);
                squarMap.get(sqKey).add(board[row][col]);
            }
        }
        return true;
    }
}
