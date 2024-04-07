class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int minOpen = 0, maxOpen = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            } else if (ch == ')') {
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen--;
            } else if (ch == '*') {
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen++;
            }

            if (maxOpen < 0) {
                return false; // More ')' than '('
            }
        }

        return minOpen == 0; // All '(' are matched
    }
}
