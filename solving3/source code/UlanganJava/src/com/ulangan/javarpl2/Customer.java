package com.ulangan.javarpl2;

import com.ulangan.javarpl2.model.SmartPhone;

/**
 * Created by ramdani on 11/8/16.
 */
public class Customer {

    public static void main(String[] args){

        SmartPhone smartPhone = new SmartPhone(
                131111100,
                "Xiaomi",
                "Redmi 2",
                2,
                16,
                "MIUI 8 ( Android Lollipop )"
        );

        System.out.println("== DETAIL SMARTPHONE ==");
        System.out.println("No IMEI\t: "+smartPhone.getNomorIMEI());
        System.out.println("Merek\t: "+smartPhone.getMerek());
        System.out.println("Type\t: "+smartPhone.getType());
        System.out.println("RAM\t\t: "+smartPhone.getRam()+" GB");
        System.out.println("ROM\t\t: "+smartPhone.getRom()+" GB");
        System.out.println("OS\t\t: "+smartPhone.getOs());


    }
}
