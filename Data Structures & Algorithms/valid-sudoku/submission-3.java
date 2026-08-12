class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isValidSudoku = true;
        int size = board.length;
        if (size != 9 || board[0].length != 9)
        {
            return false;
        }
        for (int row = 0; row < size; row++)
        {
            boolean rowValid = rowValid(board, row);
            if (!rowValid)
            {
                return rowValid;
            }
        }
        for (int col = 0; col < size; col++)
        {
            boolean colValid = colValid(board, col);
            if (!colValid)
            {
                return colValid;
            }
        }
        for (int box = 0; box < size; box++)
        {
            boolean boxValid = boxValid(board, box);
            if (!boxValid)
            {
                return boxValid;
            }
        }
        return true;
    }

    public boolean rowValid(char[][] board, int row)
    {
        HashSet chars = new HashSet<>();
        for (int i = 0; i < board[row].length; i++)
        {
            char curr = board[row][i];
            if (curr != '.' && !chars.isEmpty() && chars.contains(curr))
            {
                return false;
            }
            chars.add(curr);
        }
        return true;
    }

    public boolean colValid(char[][] board, int col)
    {
        HashSet chars = new HashSet<>();
        for (int i = 0; i < board.length; i++)
        {
            char curr = board[i][col];
            if (curr != '.' && !chars.isEmpty() && chars.contains(curr))
            {
                return false;
            }
            chars.add(curr);
        }
        return true;
    }

    public boolean boxValid(char[][] board, int box)
    {
        HashSet chars = new HashSet<>();
        int startRow = (box/3) * 3;
        int startCol = (box % 3) * 3;
        for (int i = startRow; i < startRow + 3; i++)
        {
            for (int j = startCol; j < startCol + 3; j++)
            {
                char curr = board[i][j];
                if (curr != '.' && !chars.isEmpty() && chars.contains(curr))
                {
                    return false;
                }
                chars.add(curr);
            }
        }
        return true;
    }
}
