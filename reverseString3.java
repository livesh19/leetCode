class Solution {
    public String reverseWords(String s) {
       int start=0;
       char [] arr=s.toCharArray(); 
       for(int i=0;i<=s.length();i++){
        if(i==arr.length || arr[i]==' '){
            reverseWords(arr,start,i-1);
            start=i+1;
        }
       }
       return new String(arr);
       
    }
    private void reverseWords(char [] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}