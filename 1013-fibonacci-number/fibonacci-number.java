class Solution {
    public int Ooo(int first, int second,int n, int count){
        if(count == n) return first;
        int total = first + second;
        return Ooo(second, total, n, count+1);
    }
    public int fib(int n) {
        if(n == 0) return 0;
        return Ooo(0,1, n, 0);
    }
}