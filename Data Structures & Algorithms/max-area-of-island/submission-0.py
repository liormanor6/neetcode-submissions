class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0

        maxArea = 0
        currArea = 0
        visited = set()
        rows, cols = len(grid), len(grid[0])
        
        def bfs(i,j):
            q = collections.deque()
            q.append((i,j))
            visited.add((i, j))
            directions = [[-1,0], [1,0], [0, -1], [0,1]]
            currArea = 1
            while q:
                r, c = q.popleft()
                for dr, dc in directions:
                    new_row, new_col = r + dr, c + dc
                    if (new_row in range(rows) and new_col in range(cols)
                        and (new_row, new_col) not in visited
                        and grid[new_row][new_col] == 1):
                        currArea += 1
                        q.append((new_row, new_col))
                        visited.add((new_row, new_col))
            return currArea

        for i in range(rows):
            for j in range(cols):
                if (grid[i][j] == 1 and (i,j) not in visited):
                    area = bfs(i,j)
                    if area > maxArea:
                        maxArea = area
        return maxArea