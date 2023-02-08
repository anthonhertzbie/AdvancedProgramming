package week1;

import java.util.LinkedList;

public class LinkedStack implements Stack{

    LinkedList<String> list;

    private int size;

    public LinkedStack(){
        list = new LinkedList<>();
        size = 0;
    }

    @Override
    public void push(String e) {
        list.add(e);
        size++;
    }

    @Override
    public String pop() {
        if(list.isEmpty()){
            System.out.println("The list is empty so nothing can be removed");
            return null;
        } else{
            return list.remove();
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedStack l = new LinkedStack();
        l.push("hej");
        l.push("med");
        l.push("dig");
        l.show();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
    }

}
