class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j)
        {
            char curri = s.charAt(i);
            char currj = s.charAt(j);

            if (!Character.isLetter(curri) && !Character.isDigit(curri))
            {
                i++;
                continue;
            }
            if (!Character.isLetter(currj) && !Character.isDigit(currj))
            {
                j--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
