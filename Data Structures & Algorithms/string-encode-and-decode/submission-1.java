class Solution {

    /* 
        Rough Notes
        Goal here is to get the actual integer value for the first substring
        
        After we get the len of substring, next goal is to then get the actual 
        substring added to result ArrayList

        We will need to add this substring in our ArrayList so first 
        we need to get the word

        After that we need to have index start at one character at end of word

        so i = j + 1 + len

        //Time complexity is O(N) and space complexity is O(N)

        I want value before # example 5#toinh

    */

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            int len = s.length();
            String sLen = String.valueOf(len);
            sb.append(sLen + "#" + s);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            int j = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j + 1, j + 1 + len);
            result.add(word);
            i = j + 1 + len;
        }

        return result;

    }
}
