class Solution {
    public boolean isAnagram(String s, String t) {
        int lengthOfs = s.length();
        int lengthOft = t.length();
        HashMap<Character, Integer> stringsHashMap = new HashMap<>(lengthOfs);
        HashMap<Character, Integer> stringtHashMap = new HashMap<>(lengthOft);
        if (lengthOfs != lengthOft)
        {
            return false;
        }

        for (int i = 0; i < lengthOfs; i++)
        {
            if (stringsHashMap.get(s.charAt(i)) == null)
            {
                stringsHashMap.put(s.charAt(i), 1);
            }
            else {
                stringsHashMap.replace(s.charAt(i), stringsHashMap.get(s.charAt(i))+1);
            }

            if (stringtHashMap.get(t.charAt(i)) == null)
            {
                stringtHashMap.put(t.charAt(i), 1);
            }
            else {
                stringtHashMap.replace(t.charAt(i), stringtHashMap.get(t.charAt(i))+1);
            }
        }
        return stringsHashMap.equals(stringtHashMap);
    }

}
