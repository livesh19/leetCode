class Solution {
    private int modify(String pattern, StringBuilder s, int points) {
        int n = s.length();
        if (n < 2) return 0;

        StringBuilder newS = new StringBuilder();
        int tot = 0;
        for (int i = 0; i < n; ++i) {
            int newLength = newS.length();
            if (newLength > 0 && newS.charAt(newLength - 1) == pattern.charAt(0) && s.charAt(i) == pattern.charAt(1)) {
                newS.deleteCharAt(newLength - 1);
                tot += points;
            } else {
                newS.append(s.charAt(i));
            }
        }
        s.setLength(0);
        s.append(newS);
        return tot;
    }

    public int maximumGain(String s, int x, int y) {
        StringBuilder copyS = new StringBuilder(s);
        int points = 0;
        if (x > y) {
            points += modify("ab", copyS, x);
            points += modify("ba", copyS, y);
        } else {
            points += modify("ba", copyS, y);
            points += modify("ab", copyS, x);
        }
        return points;
    }
}