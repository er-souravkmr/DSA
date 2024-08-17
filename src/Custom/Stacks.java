package Custom;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) throws Exception{
//        Stack<Integer> st = new Stack<>(); // Stack Declaration
//        st.push(31);  // Used to push item in Stack   st.push()
//        st.push(1);
//        st.push(3);
//        st.push(2);
//        st.push(11);
//        st.push(41);
//
//        System.out.println(st.peek()); // Used to return last element;
//        System.out.println(st); // We can Directly print stack in java using this in formatted way
//        st.pop();  // Used to delete and return last element ;
//        System.out.println(st.size()); //used to return size of Stack


        //  Testing of Custom Stack
//        CustomStack cs = new CustomStack(5);
//        cs.push(32);
//        cs.push(2);
//        cs.push(31);
//        cs.push(30);
//
//
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());



//       Testing of Custom Dynamic Stack
        DynamicStack cs = new DynamicStack(5);
        cs.push(32);
        cs.push(2);
        cs.push(31);
        cs.push(30);
        cs.push(30);
        cs.push(35);
        cs.push(33);


        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());



    }
}
