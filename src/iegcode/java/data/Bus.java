package iegcode.java.data;

public class Bus implements  Car{
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }
    @Override
    public int getTier() {
        return 8;
    }
    @Override
    public String getBrand() {
        return "Nino";
    }
    @Override
    public boolean isMaintenance() {
        return false;
    }
    @Override
    public boolean isBig() {
        return true;
    }
}
