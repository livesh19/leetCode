class Solution {
    public String convert(String s, int numRows) {
       if(numRows == 1 || s.length()<numRows)return s;

       StringBuilder rows[] = new StringBuilder[numRows];
       for(int i = 0 ; i<rows.length;i++){
        rows[i]=new StringBuilder();
       }

       boolean down =false;
       int ind=0;
       for(char c : s.toCharArray()){
        rows[ind].append(c);
        if(ind==0 || ind ==numRows-1){
            down = !down;
        }
        ind+=down?1:-1;
       }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();

        
    }
}