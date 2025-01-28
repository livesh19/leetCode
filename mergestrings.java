class Solution {
    public String mergeAlternately(String word1, String word2) {
        char [] ch=word1.toCharArray();
        char [] ch1=word2.toCharArray();
        int n=word1.length();
        int m=word2.length();
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<n || j<m){
            if(i<n){
                sb.append(ch[i]);
                i++;
            }
            if(j<m){
                sb.append(ch1[j]);
                j++;
            }

        }
        return sb.toString();

    }
}