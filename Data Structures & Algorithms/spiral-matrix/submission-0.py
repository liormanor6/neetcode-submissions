class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        spiral = []
        visited = set()
        i, j = 0, 0
        directions = [[0, 1], [1, 0], [0, -1], [-1, 0]]
        curr_dir = 0
        rows = len(matrix)
        cols = len(matrix[0])
        spiral.append(matrix[i][j])
        while len(spiral) < rows * cols:
            visited.add((i,j))
            dr, dc = i + directions[curr_dir][0], j + directions[curr_dir][1]
            if (dr in range(rows) and
            dc in range(cols)
            and (dr, dc) not in visited):
                spiral.append(matrix[dr][dc])
                i, j = dr, dc
            else:
                curr_dir = (curr_dir + 1) % 4
        return spiral
