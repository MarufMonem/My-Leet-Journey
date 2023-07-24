package P20;

import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char val : s.toCharArray()){
            try {
                if (val == '(' || val == '{' || val == '['){
                    stack.push(val);
                }else if(val == ')'){
                    if (stack.peek() == '('){
                        stack.pop();
                    }else{
                        break;
                    }

                }else if(val == '}'){
                    if (stack.peek() == '{'){
                        stack.pop();
                    }else{
                        break;
                    }

                }else if(val == ']'){
                    if (stack.peek() == '['){
                        stack.pop();
                    }else{
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println(e);
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "(({}[])";
        System.out.println(input);
        System.out.println( isValid(input));
    }
}

