class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rowseen = defaultdict(set)
        colseen = defaultdict(set)
        square = defaultdict(set)

        for i in range(len(board)):
            for j in range(len(board[0])):
                
                if board[i][j] == '.':
                    continue
                if (board[i][j] in rowseen[i] or board[i][j] in colseen[j] or board[i][j] in
                    square[(i // 3, j // 3)]):
                    return False
                
                rowseen[i].add(board[i][j])
                colseen[j].add(board[i][j])
                square[(i // 3, j // 3)].add(board[i][j])
        return True
