class Solution {
    private String seperator = "redbird";
    public String encode(List<String> strs) {
        String encodedString = "";
       for (int i = 0; i < strs.size(); i++)
       {
        encodedString += strs.get(i) + seperator;
       }
       return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int currIndex = 0;
        int seperatorIndex = str.indexOf(seperator, currIndex);
        while (currIndex < str.length() && seperatorIndex != -1)
        {
            decodedList.add(str.substring(currIndex, seperatorIndex));
            currIndex = seperatorIndex + seperator.length();
            seperatorIndex = str.indexOf(seperator, currIndex);
        }

        return decodedList;
    }
}
