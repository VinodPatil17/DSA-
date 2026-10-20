class Solution {
    public void rev(int start,char[] s, int n, int end){
        if(start >= n/2) return;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        rev(start+1, s, n, end-1);
    }
    public void reverseString(char[] s) {
        int n = s.length;
        rev(0, s, n, n-1);
    }
}