package iegcode.java.application;

import iegcode.java.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest =  new LoginRequest("Gibran", "Demo123");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Ibrahim"));
        System.out.println(new LoginRequest("Ibrahim","Demo321"));

    }
}
