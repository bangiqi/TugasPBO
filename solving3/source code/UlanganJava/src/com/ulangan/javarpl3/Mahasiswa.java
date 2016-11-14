package com.ulangan.javarpl3;

import com.ulangan.javarpl3.model.MataKuliah;

/**
 * Created by ramdani on 11/8/16.
 */
public class Mahasiswa {

    public static void main(String[] args){

        MataKuliah mataKuliah = new MataKuliah(
                1311051503,
                "FA411",
                "Studi Islam IV",
                2,
                "Senin",
                205
        );
        System.out.println("== KARTU TANDA PESERTA UTS ==");
        System.out.println("NPM \t\t: "+mataKuliah.getNpm());
        System.out.println("Kode Matkul : "+mataKuliah.getKodeMataKuliah());
        System.out.println("Nama Matkul : "+mataKuliah.getNamaMataKuliah());
        System.out.println("Kredit \t\t: "+mataKuliah.getKredit()+" SKS");
        System.out.println("Hari \t\t: "+mataKuliah.getHari());
        System.out.println("Ruang \t\t: "+mataKuliah.getNoRuang());


    }
}
