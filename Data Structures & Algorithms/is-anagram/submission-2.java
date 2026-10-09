class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[Character.toLowerCase(s.charAt(i)) - 'a']++;
            count[Character.toLowerCase(t.charAt(i)) - 'a']--;
        }
        
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;

    }

}