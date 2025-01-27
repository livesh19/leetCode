class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        int right=0;
        int left=0;
        int max=0;
        while (right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            max=Math.max(right-left+1,max);
            right+=1;
        }
        return max;
        
    }
}