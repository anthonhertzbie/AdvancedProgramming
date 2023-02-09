package week2;

import java.util.Scanner;

public class TUI {
    IFunctionality f;
    Scanner scan = new Scanner(System.in);
    public TUI(IFunctionality f){
        this.f = f;
    }

    public void show(){
        String cpr = scan.nextLine();
        System.out.println(getBMI(cpr));
    }

    public String getBMI(String cpr){
        StringBuilder info = new StringBuilder();
        info.append(f.getName(cpr) + "\n" + f.getBMI(cpr));
        return info.toString();
    }
}
