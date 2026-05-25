class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        while row < len(matrix):
            l, r = 0, len(matrix[row]) - 1
            while l <= r:
                if matrix[row][r] < target:
                    break
                else:
                    m = (l+r) // 2
                    if matrix[row][m] > target:
                        r = m - 1
                    elif matrix[row][m] < target:
                        l = m + 1
                    else:
                        return True
            row += 1
        return False