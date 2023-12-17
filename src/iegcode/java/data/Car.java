package iegcode.java.data;

public interface Car extends  HasBrand, IsMaintenace{
    void drive();

    int getTier();

    // menggunakan constcrate
  default boolean isBig(){
      return false;
  }
}
