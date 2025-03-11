class Solution {
    public int numberOfSubstrings(String s) {
        int count [] = new int [3];
        int total =0;
        int left =0;
        for(int ri8=0;ri8<s.length();ri8++){
            count[s.charAt(ri8)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                total += s.length()-ri8;
                count[s.charAt(left)-'a']--;
                left++;
            }
        }
        return total;
    }
}