package iegcode.java.application;

import iegcode.java.MathUtil.ValidationUtil;
import iegcode.java.data.LoginRequest;
import iegcode.java.error.ValidationException;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Gibran", "demo");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception){
            System.out.println("Data Tidak Valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di Eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime((loginRequest2));
        System.out.println("Sukses");
    }
}
