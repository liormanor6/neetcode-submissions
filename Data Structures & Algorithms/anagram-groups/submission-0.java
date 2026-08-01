class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();

        HashMap<String, Integer> stringToIndexMapping = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String sortedString = new String(tempArray);

            if (stringToIndexMapping.get(sortedString) == null)
            {
                int index = anagrams.size();
                List<String> currList = new ArrayList<>();
                currList.add(strs[i]);
                anagrams.add(currList);
                stringToIndexMapping.put(sortedString, index);
            }
            else
            {
                int index = stringToIndexMapping.get(sortedString);
                anagrams.get(index).add(strs[i]);
            }
        }

        return anagrams;
    }
}
