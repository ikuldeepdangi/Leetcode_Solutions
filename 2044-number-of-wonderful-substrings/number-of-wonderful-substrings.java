class Solution {
    public long wonderfulSubstrings(String word) {
        long count = 0;
        int[] prefixCount = new int[1024]; // 2^10 possible bitmasks

        int bitmask = 0;
        prefixCount[0] = 1;

        for (char c : word.toCharArray()) {
            int charIndex = c - 'a';
            bitmask ^= (1 << charIndex);
            count += prefixCount[bitmask];

            for (int i = 0; i < 10; i++) {
                count += prefixCount[bitmask ^ (1 << i)];
            }

            prefixCount[bitmask]++;
        }

        return count;
    }
}