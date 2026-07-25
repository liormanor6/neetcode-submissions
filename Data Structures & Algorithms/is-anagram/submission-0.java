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
            Character currs = s.charAt(i);
            Character currt = t.charAt(i);
            if (stringsHashMap.get(currs) == null)
            {
                stringsHashMap.put(currs, 1);
            }
            else {
                int currVal = stringsHashMap.get(currs);
                stringsHashMap.replace(currs, currVal+1);
            }

            if (stringtHashMap.get(currt) == null)
            {
                stringtHashMap.put(currt, 1);
            }
            else {
                int currVal = stringtHashMap.get(currt);
                stringtHashMap.replace(currt, currVal+1);
            }
        }
        return stringsHashMap.equals(stringtHashMap);
    }

}
