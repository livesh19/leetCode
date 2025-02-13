class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk =new Stack<Integer>();
        int sum;
        for(String ch : tokens){
            if(isOperator(ch)){
                int b=stk.pop();
                int a=stk.pop();
                stk.push(applyOperation(a,b,ch));
            }
            else{
                stk.push(Integer.parseInt(ch));
            }
        }
        return stk.peek();
        
    }
    private Boolean isOperator(String c){
        return c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/");
    }

    private int applyOperation(int a , int b , String ch){
        switch (ch){
            case "+" :return a+b;
    
            case "-" :return a-b;

            case "*" :return a*b;

            case "/" :return a/b;

        }
        throw new IllegalArgumentException("Invalid operator: " + ch);


    }


}