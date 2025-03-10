public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count =0;
        if(k>blocks.length())return -1;
        char[] ch=blocks.toCharArray();
        for(int i=0;i<k;i++){
            if(ch[i]=='W'){
                count+=1;
            }
        }
        int min=count;
        for(int i=k;i<ch.length;i++){
            if(ch[i]=='W'){
                count+=1;
            }
            if(ch[i-k]=='W'){
                count--;
            }
            min=Math.min(min,count);
        }
        return min;
    }
} {
    
}
