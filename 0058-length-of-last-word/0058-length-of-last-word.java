class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int counter = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            String c = String.valueOf(s.charAt(i));
            if(!c.equals(" ")) counter++;
            else break;
        }   

        return counter;
    }
}