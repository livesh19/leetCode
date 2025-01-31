class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        char [] ch1=s.toCharArray();
        char [] ch2=t.toCharArray();
        int j=0;
        for(int i=0;i<t.length();i++){
            if(ch1[j]==ch2[i]){
                j++;
                if(j==s.length()){
                    return true;
                } 
            }
            
        }
        
        return false;
    }
}