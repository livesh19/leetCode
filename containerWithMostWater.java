class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int Max = 0;
        int sum=0;
        while(i<j){
            sum=Math.min(height[i],height[j])*(j-i);
            Max=Math.max(sum,Max);
            if(height[i]<height[j]){
                i++;

            }
            else{
                j--;
            }
        }
        return Max;
    }
}