package StackAndQueue;

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
//        DynamicStack cs = new DynamicStack(5);
//        cs.push(32);
//        cs.push(2);
//        cs.push(31);
//        cs.push(30);
//        cs.push(30);
//        cs.push(35);
//        cs.push(33);
//
//
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());


//        Testingg of Queue using Stack

//          QueueUsingStack test = new QueueUsingStack();
//
//          test.add(6);
//          test.add(5);
//          test.add(4);
//          test.add(3);
//          test.add(2);
//
//          System.out.println(test.remove());
//          System.out.println(test.remove());
//          System.out.println(test.remove());
//          System.out.println(test.remove());
//          System.out.println(test.remove());

        // Testing of Stack Using Queue

        StackUsingQueue test = new StackUsingQueue();

        test.push(32);
        test.push(33);
        test.push(30);
        test.push(31);

        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());

    }
}
