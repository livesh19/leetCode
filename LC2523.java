class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = sieve(right);
        List<Integer> prime= new ArrayList<Integer>();
        for(int i= left;i<=right;i++){
            if(isPrime[i]){
                prime.add(i);
            }
        }
        if(prime.size()<2){
            return new int []{-1,-1};
        }
        int minDiff=Integer.MAX_VALUE;
        int num1=-1;
        int num2=-1;
        for(int i=1;i<prime.size();i++){
            int diff = prime.get(i)-prime.get(i-1);
            if(diff<minDiff){
                minDiff=diff;
                num1=prime.get(i-1);
                num2=prime.get(i);
            }
        }
        return new int []{num1, num2};
    }
    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; 

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}