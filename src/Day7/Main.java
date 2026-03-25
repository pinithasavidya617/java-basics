package Day7;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(8);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);

        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Is stack full? " + stack.isFull());

    }
}

