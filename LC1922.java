class Solution {
    public int countGoodNumbers(long n) {
          long mod = 1000000007;
           long evenIndexCount = (n + 1) / 2;
        long oddIndexCount = n / 2;
           long evenChoices = pow(5, evenIndexCount, mod); 
        long oddChoices = pow(4, oddIndexCount, mod);  
         return (int)(evenChoices * oddChoices % mod);
    
    }
     private long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
                while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp / 2;
        }
        return result;
     }

}