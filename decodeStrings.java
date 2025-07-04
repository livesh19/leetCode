import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentNumber = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

          
            if (ch >= '0' && ch <= '9') {
                currentNumber += ch;
            }
            else if (ch == '[') {
                // int num = 0;
                // for (int j = 0; j < currentNumber.length(); j++) {
                //     num = num * 10 + (currentNumber.charAt(j) - '0');
                // }
                numberStack.push(Integer.parseInt(currentNumber));
                currentNumber = "";

                stringStack.push("["); // marker
            }
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                stringStack.push(String.valueOf(ch));
            }

            else if (ch == ']') {
                String temp = "";
                while (!stringStack.empty()) {
                    String top = stringStack.pop();
                    if (top.equals("[")) {
                        break;
                    }
                    temp = top + temp; 
                }
                int repeatCount = numberStack.pop();
                String repeated = "";
                for (int j = 0; j < repeatCount; j++) {
                    repeated += temp;
                }
                stringStack.push(repeated);
            }
        }
        String result = "";
        while (!stringStack.empty()) {
            result = stringStack.pop() + result;
        }

        return result;
    }
}
