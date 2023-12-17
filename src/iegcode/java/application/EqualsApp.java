package iegcode.java.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Ibrahim";
        first = first + " " + "Gibran";
        System.out.println(first);

        String secound = "Ibrahim Gibran";
        System.out.println(secound);

        System.out.println(first == secound);
        System.out.println(first.equals(secound));

        String third = "Ibrahim Gibran";

        System.out.println(secound == third);
        System.out.println(secound.equals(third));
    }

}
