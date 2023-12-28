package iegcode.java.application;

import iegcode.java.MathUtil.ValidationUtil;
import iegcode.java.data.CreateUserRequest;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Gibran");
        request.setPassword("Gibran");
        request.setName("Gibran");
        ValidationUtil.validationReflection(request);
    }
}
