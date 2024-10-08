class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length()) return -1;

        for(int i = 0; i < haystack.length(); i++){
            if(haystack.length() - i < needle.length()) return -1;
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i + j) != needle.charAt(j)) break;
                if(j == needle.length() - 1) return i;
            }
        }

        return -1;
    }
}