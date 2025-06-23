class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int len = s.length();
        int i =0;
       List<List<Integer>> ans = new ArrayList<>();
        while(i<len){
            int j =i;
            while(j<len && s.charAt(i)==s.charAt(j))j++;
            if(j-i>=3){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j-1);
                ans.add(list);
            }
            i=j;
        }
        return ans;
    }
}