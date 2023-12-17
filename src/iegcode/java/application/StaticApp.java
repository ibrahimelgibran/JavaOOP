package iegcode.java.application;

import iegcode.java.MathUtil.MathUtil;
import static iegcode.java.data.Application.PROCESSORS;
import static iegcode.java.data.Constant.*;
import iegcode.java.data.Country;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Jogja");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
