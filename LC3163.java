class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        int i =0;
        while(i<word.length()){
            int count =1;
            while(i+1<word.length() && word.charAt(i)==word.charAt(i+1) && count<9){
                i++;
                count++;
            }
            str.append(count);
            str.append(word.charAt(i));
            i++;
        }
        return new String(str);
    }
}