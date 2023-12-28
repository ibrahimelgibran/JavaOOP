package iegcode.java.application;

import iegcode.java.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
    ConnectDatabase("Gibran", "Demo123");
        System.out.println("Sukses");
    }

    public static void ConnectDatabase(String username, String password){
    if(username == null || password == null){
        throw new DatabaseError("Tidak Dapat Terkonek Ke Database");
    }
    }
}
