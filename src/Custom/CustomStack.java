package Custom;

import CustomException.CustomException;

public class CustomStack {
    protected int[] data ;
    private static final int CUSTOM_LENGTH = 10;

    private int ptr = -1;

    public CustomStack(){
        this(CUSTOM_LENGTH);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr ++;
        data[ptr] = val;
        return true;
    }
    public int peek(int val) throws CustomException {
        if(isEmpty()){
            throw new CustomException("Nothing is in Stack");
        }

        return data[ptr];

    }
    public int pop() throws CustomException {
        if(isEmpty()){
            throw new CustomException("Nothing is in Stack");
        }

        return data[ptr--];
    }


    public boolean isFull() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }


}
