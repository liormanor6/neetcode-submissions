class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> indices = new HashMap<>();
        if (s.length() == 0)
            return 0;
        int longest = 0;
        int curr = 0;
        int passedIndices = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (!indices.containsKey(s.charAt(i)))
            {
                indices.put(s.charAt(i), i);
                curr++;
            }
            else 
            {
                int index = indices.get(s.charAt(i));
                curr = i - index;
                for (int j = passedIndices; j <= index; j++)
                {
                    indices.remove(s.charAt(j), j);
                }
                passedIndices = index + 1;
                indices.put(s.charAt(i), i);
            }
            if (curr > longest)
            {
                longest = curr;
            }
        }
        return longest;
    }
}
