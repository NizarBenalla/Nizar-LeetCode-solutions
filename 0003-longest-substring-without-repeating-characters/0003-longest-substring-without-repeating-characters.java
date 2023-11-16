class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int left = 0, right = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int where = map.get(c);
                if (where >= right) {
                    right = where + 1;
                }
            }
            map.put(c, i);
            left++;
            max = Math.max(max, left - right);

        }
        return max;
    }
}