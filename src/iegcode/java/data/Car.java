package iegcode.java.data;

import annotation.Fancy;

@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends  HasBrand, IsMaintenace{
    void drive();

    int getTier();

    // menggunakan constcrate
  default boolean isBig(){
      return false;
  }
}
