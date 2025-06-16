class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row =1;row<=numRows;row++){
            List<Integer> temp = new ArrayList<>();
            for(int col =1;col<=row;col++){
                temp.add(generateRow(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;
    }
    public int generateRow(int row , int col){
        int res=1;
        for(int i=0;i<col;i++){
            res=res*(row-i);
            res=res/(i+1);
        }
        return res;
    }
}