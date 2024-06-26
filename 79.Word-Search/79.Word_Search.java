class Solution {
    public boolean search(char[][] board, String word, int row, int col, int index) {
        if(index == word.length()) return true;
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) return false;
        board[row][col] = '*';
        int r[] = {-1, 1, 0, 0};
        int c[] = {0, 0, -1, 1};
        for(int i=0; i<c.length; i++) {
            boolean answer = search(board, word, row + r[i], col + c[i], index+1);
            if(answer == true) return answer;
        }
        board[row][col] = word.charAt(index);
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean answer = search(board, word, i, j, 0);
                    if(answer == true) return answer;
                }
            }
        }
        return false;
    }
}