class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        int sum =0;
        int sign =1;

        for(int i =0;i<s.length();i++){
           if(s.charAt(i)>='0' && s.charAt(i)<='9') {
            int num=0;
            while(s.length()>i && s.charAt(i)>='0' && s.charAt(i)<='9'){
                num=(num*10)+s.charAt(i)-'0';
                i++;
            }
            i--;
            sum=sum+(num*sign);
           }
           else if(s.charAt(i)=='+'){
            sign=1;
           }
           else if(s.charAt(i)=='-'){
            sign = -1;
           }
           else if(s.charAt(i)=='('){
            stk.push(sum);
            stk.push(sign);
            sum=0;
            sign=1;
           }
           else if(s.charAt(i)==')'){
            sum=sum*stk.peek();
            stk.pop();
            sum+=stk.peek();
            stk.pop();
           }
        }
        return sum;
       
    }
}