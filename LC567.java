class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1= s1.length();
        int len2=s2.length();
        if(len1>len2){
            return false;
        }
        int [] arr1=new int[26];
        int [] arr2= new int[26];
        for(char c : s1.toCharArray()){
            arr1[c-'a']++;
        }
        for(int i=0;i<len1;i++){
            arr2[s2.charAt(i)-'a']++;

        }
        if(Arrays.equals(arr1,arr2))return true;
        for(int i= len1;i<len2;i++){
            arr2[s2.charAt(i)-'a']++;
            arr2[s2.charAt(i-len1)-'a']--;
            if(Arrays.equals(arr1,arr2))return true;

        }
        return false;
    }
} 