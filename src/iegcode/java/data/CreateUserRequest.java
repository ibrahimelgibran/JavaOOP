package iegcode.java.data;

import annotation.NotBlack;

public class CreateUserRequest {
    @NotBlack
    private String username;
    @NotBlack
    private String password;

    @NotBlack
    private  String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
