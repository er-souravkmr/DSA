package StackAndQueue;

import java.util.Stack;

public class Questions {
    public static void main(String[] args) {
        // how many bracket are need to be added in order to make parenthesis Valid leet-code :921

        String s = "())";
        System.out.println(valid(s)); // 1st Question


    }

    public static int  valid(String s) {
        Stack <Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if( !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }else {
                stack.push(ch);
            }
        }

        return stack.size();
    }


}
