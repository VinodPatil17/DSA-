class Solution {
    public boolean rec(int left, String ans, int right){
        if(left >= right) return true;

        if(ans.charAt(left) != ans.charAt(right)) return false;

        left++;
        right--;
       return rec(left, ans, right);
    }
    public boolean isPalindrome(String s) {
        String comp = s.replaceAll("[^a-zA-Z0-9]","");
        String ans = comp.toLowerCase();
        int n = ans.length();
        int left = 0;
        int right = n - 1;
        return rec(0, ans, n-1);
    }
}