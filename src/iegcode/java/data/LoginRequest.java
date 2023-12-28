package iegcode.java.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Membuat Object LoginRequest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("","");
    }
}
