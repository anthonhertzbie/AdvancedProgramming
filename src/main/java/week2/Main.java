package week2;

public class Main {
    public static void main(String[] args) {
        IData d = new Data();
        IFunctionality f = new Functionality(d);
        TUI t = new TUI(f);
        t.show();
    }
}
