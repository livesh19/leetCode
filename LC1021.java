class Solution {
    public String removeOuterParentheses(String s) {
        char [] arr=s.toCharArray();
        StringBuilder sb= new StringBuilder();
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==')')count--;
            if(count!=0)sb.append(arr[i]);
            if(arr[i]=='(')count++;
        }
        return sb.toString();
    }
}