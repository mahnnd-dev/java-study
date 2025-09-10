package dev.m;

import dev.m.obj.Subject;
import dev.m.obj.Sudent;

public class MainMaven {
    public static void main(String[] args) {
        System.out.println("Hello world !");
        Subject subject = new Subject("manhnd", "HUBT100", "10");
        System.out.println(subject.toString());
        Sudent sudent = new Sudent("manhnd", "HUBT100", "10");
        System.out.println(sudent.toString());
    }
}
