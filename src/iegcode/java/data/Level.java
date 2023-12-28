package iegcode.java.data;

import annotation.Fancy;

@Fancy(name = "Enum", tags = {"Application", "Java"})
public enum Level {

    STANDARD("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String descripsion;

    Level(String descripsion){
        this.descripsion = descripsion;
    }

    public String getDescripsion() {
        return descripsion;
    }
}
