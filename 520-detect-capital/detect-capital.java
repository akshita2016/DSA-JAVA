class Solution {
    public boolean detectCapitalUse(String word) {
        int Count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                Count++;
            }
        }
        return Count == word.length() ||
               Count == 0 ||
               (Count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}