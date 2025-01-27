class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k==cardPoints.length){
            int su = Arrays.stream(cardPoints).sum();
            return su;
        }
        int l=k;
        int r=cardPoints.length-1;
        int lSum=0;

        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        int max=lSum;
        for(int i=0;i<k;i++){
            lSum=lSum-cardPoints[l-1];
            lSum+=cardPoints[r];
            l--;
            r--;
            
            if(lSum>max){
               max=lSum;
            }
        }
        return max;
    }
}