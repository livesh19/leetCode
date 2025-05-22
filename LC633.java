class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        long b =(long) Math.sqrt(c);
        long sq=0;
        while(b>=a){
            sq = (long)(a*a + b*b);
            if(sq==c){
                return true;
            }
            else if(sq>c){
                b--;
            }
            else{
                a++;
            }
        }
        return false;
    }
}