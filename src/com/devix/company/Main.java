package com.devix.company;

interface MiInterface {
    void method1();

    void method2();
}

public class Main implements MiInterface {

    public static void main(String[] args) {

        MiInterface miInterface = new Main();
        miInterface.method1();
        miInterface.method2();
    }

    public void method1() {
        System.out.println("Implementation of method 1");
    }

    public void method2() {
        System.out.println("Implementation of method 2");
    }

}
