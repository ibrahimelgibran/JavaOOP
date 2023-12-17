package iegcode.java.data;

public class Avanza implements Car{

    @Override
    public void drive() {
        System.out.println("Avanza Drive");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    public  boolean isMaintenance(){
        return false;
    }

}
