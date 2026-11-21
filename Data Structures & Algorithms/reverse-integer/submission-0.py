class Solution:
    def reverse(self, x: int) -> int:
        res = 0
        negative = False
        if x < 0:
            x *= -1
            negative = True 
        MIN_INT32 = -(2**31)
        MAX_INT32 = 2**31 - 1
        while x:
            digit = x % 10
            x = x // 10
            if (res > 214748364 or
            res == 214748364 and negative and digit > 8 or
            res == 214748364 and digit > 7):
                return 0
            res = res * 10 + digit
            print(res)
        if negative:
            res *= -1
        return res
        