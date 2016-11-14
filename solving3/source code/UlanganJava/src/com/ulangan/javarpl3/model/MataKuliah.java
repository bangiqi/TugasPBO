package com.ulangan.javarpl3.model;

/**
 * Created by ramdani on 11/8/16.
 */
public class MataKuliah {

    long npm;
    String kodeMataKuliah;
    String namaMataKuliah;
    int kredit;
    String hari;
    int noRuang;

    public MataKuliah(long npm, String kodeMataKuliah, String namaMataKuliah, int kredit, String hari, int noRuang) {
        this.npm = npm;
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.kredit = kredit;
        this.hari = hari;
        this.noRuang = noRuang;
    }

    public long getNpm() {
        return npm;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public int getKredit() {
        return kredit;
    }

    public String getHari() {
        return hari;
    }

    public int getNoRuang() {
        return noRuang;
    }
}
