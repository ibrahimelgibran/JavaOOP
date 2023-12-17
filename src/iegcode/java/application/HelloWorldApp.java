package iegcode.java.application;

import iegcode.java.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Helo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Helo " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Gibran");

        indonesia.sayHello();
        indonesia.sayHello("Gibran");
    }
}
