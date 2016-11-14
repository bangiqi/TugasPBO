package com.ulangan.javarpl2.model;

/**
 * Created by ramdani on 11/8/16.
 */
public class SmartPhone {

    int nomorIMEI;
    String merek;
    String type;
    int ram;
    int rom;
    String os;

    public SmartPhone(int nomorIMEI, String merek, String type, int ram, int rom, String os) {
        this.nomorIMEI = nomorIMEI;
        this.merek = merek;
        this.type = type;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
    }

    public int getNomorIMEI() {
        return nomorIMEI;
    }

    public String getMerek() {
        return merek;
    }

    public String getType() {
        return type;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }
}
