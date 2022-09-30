class Solution {
    public int reverse(int x) {
       long rev = 0;
        while (x != 0){
            int remain = x % 10;
            rev = rev * 10 + remain;
            x = x/10;
        }
        if(rev >= Integer.MIN_VALUE && rev <=Integer.MAX_VALUE)
            return (int)rev;
        else 
            return 0;
    }
}