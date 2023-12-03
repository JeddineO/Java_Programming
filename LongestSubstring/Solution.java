class Solution {
    public int lengthOfLongestSubstring(String s) {
        String tmp = "";
        int res = 0, cmp = 0;
        byte t = 0;
        for (short i = 0; i < s.length(); i++) {
            t = 0;
            for (short j = 0; j < tmp.length(); j++) {
                if (tmp.charAt(j) == s.charAt(i)) {
                    tmp = tmp.substring(j + 1);
                    t = 1;
                    break;
                }
            }
            if (cmp > res && t == 1) {
                res = cmp;
            }
            if(res>=s.length() || cmp>=s.length())
              break;
             tmp += s.charAt(i);
            cmp = tmp.length();
        }
        return Math.max(res, cmp);
    }
}
