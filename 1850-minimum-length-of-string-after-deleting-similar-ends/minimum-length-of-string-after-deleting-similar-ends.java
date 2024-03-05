class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;

       
        while (i < j && s.charAt(i) == s.charAt(j)) {
            char ch = s.charAt(i);
            while (i <= j && s.charAt(i) == ch) {
                i++;
            }
            while (j >= i && s.charAt(j) == ch) {
                j--;
            }
        }

        return Math.max(j - i + 1, 0);
    }
}
