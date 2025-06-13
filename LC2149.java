class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int posArr[]=new int[n];
        int negArr[]=new int[n];
        int p=0;
        int a=0;
        for(int num : nums){
            if(num>0){
                posArr[p]=num;
                p++;
            }
            else{
                negArr[a]=num;
                a++;
            }
        }
        int q=0;
        int w=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=posArr[q];
                q++;
            }
            else{
                nums[i]=negArr[w];
                w++;
            }
        }
        return nums;
    }
}