class Solution {
    public boolean isAnagram(String s, String t) {

    char[] sString = s.toCharArray();
    char[] tString = t.toCharArray();

    Arrays.sort(sString);
    Arrays.sort(tString);

    String orderedS = new String(sString);
    String orderedT = new String(tString);

    if(orderedS.equals(orderedT)){
        return true;
    }

    return false;

    }
}
