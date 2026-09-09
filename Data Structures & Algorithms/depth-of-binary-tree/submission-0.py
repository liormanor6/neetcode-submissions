# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return max(self.recurse(root.left, 1), self.recurse(root.right, 1))
    def recurse(self, root, level) :
        if not root:
            return level
        return max(self.recurse(root.left, level + 1), self.recurse(root.right, level + 1))

        