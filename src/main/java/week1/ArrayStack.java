package week1;

public class ArrayStack implements Stack{

    private String[] arrayStack;
    private int arrayTop;
    private int arraySize;

    public ArrayStack(int arraySize){
        arrayStack = new String[arraySize];
        arrayTop = 0;
        this.arraySize = arraySize;
    }

    @Override
    public void push(String e) {
        if (arrayTop < arraySize) {
            arrayStack[arrayTop] = e;
            arrayTop++;
        } else if(arrayTop == arraySize){
            System.out.println("The arrayStack is full");
        }
    }
    @Override
    public String pop() {
        String top = arrayStack[arrayTop];
        arrayStack[arrayTop] = null;
        arrayTop--;
        return top;
    }

    @Override
    public boolean isEmpty() {
        return arrayTop == 0;
    }

    @Override
    public boolean isFull() {
        return arrayTop == arraySize;
    }

    @Override
    public void show() {
        for (int i = 0; i < arraySize; i++) {
            if(arrayStack[i] != null){
                System.out.println(arrayStack[i]);
            }
        }
        System.out.println();
    }

    //for testing:
    public static void main(String[] args) {
        ArrayStack a = new ArrayStack(5);
        a.push("1");
        a.push("2");
        a.push("3");
        a.show();
        a.push("4");
        a.push("5");
        a.push("6");
        a.show();
    }
}
