package iegcode.java.MathUtil;

import annotation.NotBlack;
import iegcode.java.data.LoginRequest;
import iegcode.java.error.BlackException;
import iegcode.java.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is Null");
        } else if(loginRequest.username().isBlank()){
            throw  new ValidationException("Username is Black");
        } else if (loginRequest.password() == null) {
            throw  new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is Black");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is Null");
        } else if(loginRequest.username().isBlank()){
            throw  new BlackException("Username is Black");
        } else if (loginRequest.password() == null) {
            throw  new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()){
            throw new BlackException("Password is Black");
        }
    }

    public  static  void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlack.class) != null){
                // validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw  new BlackException("Field " + field.getName() + " is black");
                    }
                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }

}
