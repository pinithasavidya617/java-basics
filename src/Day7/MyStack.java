package Day7;

public class MyStack {
    int [] arr;
    int top;
    int capacity;

    public MyStack(int capacity){
        this.arr = new int[capacity];
        this.top =- 1;
        this.capacity = capacity;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("stack is full!");
            return;
        }
        arr[++top] = value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty! cannot peek");
            return -1;
        }
        return arr[top];
    }

    public int pop(){
//        int index = top;
//        int value = arr[top];
//        top = top -1;
//        return value;
        if(isEmpty()){
            System.out.println("Stack is empty! cannot pop");
            return -1;
        }

        return arr[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

}
