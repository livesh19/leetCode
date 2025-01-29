class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r){
            if(isVowel(ch[l])){
                if(isVowel(ch[r])){
                    swap(ch,l,r);
                    l++;
                    r--;
                }
                else{
                r--;
                }
            }
            else{
            l++;
            }
        }
        String s1 = String. valueOf(ch); 
        return s1;
    }
    public Boolean isVowel(char c){
        if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
    public void swap(char [] ch,int l,int r){
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;  
    }
}