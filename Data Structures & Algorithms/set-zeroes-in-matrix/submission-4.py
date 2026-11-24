class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        first_row_zero = False
        rows = len(matrix)
        cols = len(matrix[0])
        for i in range(rows):
            for j in range(cols):
                if matrix[i][j] == 0:
                    if i != 0:
                        matrix[i][0] = 0
                    else:
                        first_row_zero = True
                    matrix[0][j] = 0
        for i in range(rows):
            if matrix[i][0] == 0 and i != 0:
                for j in range(1, cols, 1):
                    matrix[i][j] = 0
        for j in range(cols):
            if matrix[0][j] == 0:
                for i in range(1, rows, 1):
                    matrix[i][j] = 0
        if matrix[0][0] == 0:
            print("corner is 0")
            for i in range(rows):
                matrix[i][0] = 0 
        if first_row_zero:
            for i in range(cols):
                matrix[0][i] = 0 

        