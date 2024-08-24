package StackAndQueue;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String val = "*-A/BC-/AKL";

//        System.out.println("Postfix exp of infix"+ val +" is : " + infixToPostfix(val));
//        System.out.println("Prefix exp of infix"+ val +" is : " + infixToPrefix(val));
//        System.out.println("Infix exp of Postfix"+ val +" is : " + postfixToInfix(val));
//        System.out.println("Infix exp of Prefix"+ val +" is : " + prefixToInfix(val));
//        System.out.println("prefix exp of Postfix"+ val +" is : " + postfixToPrefix(val));
        System.out.println("Postfix exp of Prefix "+ val +" is : " + prefixToPostfix(val));
    }
    public static int prec(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;

    }

    // reverse and swap "("   with   ")";
    public static String reverse(String s){
        int n = s.length()-1;
        String ans = "";
        while(n>=0){
            if(s.charAt(n)=='('){
                ans += ')';
            }else if(s.charAt(n)==')'){
                ans += '(';
            }else{
                ans += s.charAt(n);
            }
            n--;
        }

        return ans;
    }

    public static String infixToPostfix(String s){

        StringBuilder ans = new StringBuilder();
        Stack<Character> st =new Stack<>();

        int i=0;
        while (i < s.length()){

            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans.append(c); // If operand add to ans
            }else if(c=='('){
                st.push(c); //If ( add to stack
            } else if (c==')') {

                while(!st.isEmpty() && st.peek() !='('){
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }else{

                while(!st.isEmpty() && prec(c) <= prec(st.peek())){
                    ans.append(st.pop());
                }

                st.push(c);
            }

            i++;
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        return ans.toString();
    }

    public static String infixToPrefix(String  exp){
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        String s = reverse(exp);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                ans.append(c);
            }else if( c == '('){
                st.push(c);
            } else if (c==')') {
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }

                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
            }else{
                while(!st.isEmpty() && prec(c) < prec(st.peek())){
                    ans.append(st.pop());
                }

                st.push(c);
            }

        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        ans.reverse();

        return ans.toString();
    }

    public static String postfixToInfix(String exp){

        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String a = st.pop();
                String b = st.pop();

                String s = "(" + b + c + a + ")";

                st.push(s);
            }
        }

        return st.peek();
    }

    public static String prefixToInfix(String exp){

        Stack<String> st = new Stack<>();

        for (int i = exp.length()-1; i >= 0 ; i--) {
            char c = exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String a = st.pop();
                String b = st.pop();

                String s = "("+a+c+b+")";

                st.push(s);
            }

        }
        return st.peek();
    }

    public static String postfixToPrefix(String exp){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            }else{
                String a = st.pop();
                String b = st.pop();

                st.push(c+b+a);
            }
        }
        return st.peek();
    }

    public static String prefixToPostfix(String exp){
        Stack<String> st= new Stack<>();

        for (int i = exp.length()-1; i >=0 ; i--) {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String a = st.pop();
                String b = st.pop();

                st.push(a+b+c);
            }
        }

        return st.peek();
    }
}
