class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");

        int i = 0;
        int j = cleanedString.length() - 1;

        while (i < j)
        {
            if (Character.toLowerCase(cleanedString.charAt(i)) != Character.toLowerCase(cleanedString.charAt(j)))
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
