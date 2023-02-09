package week1;

public class ArrayStack implements Stack{

    private final String[] stack;
    private int top;
    private final int size;

    public ArrayStack(int size){
        stack = new String[size];
        top = 0;
        this.size = size;
    }

    @Override
    public void push(String e) {
        if (top < size) {
            stack[top] = e;
            top++;
        } else if(top == size){
            System.out.println("The arrayStack is full, because max capacity is " + size);
        }
    }
    @Override
    public String pop() {
        if(top > 0) {
            top--;
            String poppedValue = stack[top];
            stack[top] = null;
            return poppedValue;
        } else{
            System.out.println("ArrayStack is empty");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == size;
    }

    @Override
    public void show() {
        for (int i = size - 1; i >= 0; i--) {
            if(stack[i] != null){
                System.out.print(stack[i] + " ");
            }
        }
        System.out.println();
    }

    //for testing:
    public static void main(String[] args) {
        var a = new ArrayStack(5);
        a.push("This");
        a.push("is");
        a.push("a");
        a.push("strange");
        a.push("sentence");
        a.push("hey");
        a.show();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
    }

}
