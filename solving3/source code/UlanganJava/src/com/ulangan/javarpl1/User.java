package com.ulangan.javarpl1;

import com.ulangan.javarpl1.model.Posting;

/**
 * Created by ramdani on 11/8/16.
 */
public class User {

    public static void main (String[] args){
        Posting posting = new Posting(
                100012,
                "Fahrezi",
                "semangat ya ulanganya :)",
                "1 menit yang lalu",
                20,
                5
        );

        System.out.println("== BERANDA FASEBOOK ==");
        System.out.println("id user \t\t: "+posting.getUserId());
        System.out.println("user name \t\t: "+posting.getUserName());
        System.out.println("status \t\t\t: "+posting.getStatus());
        System.out.println("waktu \t\t\t: "+posting.getWaktuPost());
        System.out.println("jumlah like \t: "+posting.getJmlLike()+" likes");
        System.out.println("jumlah komentar : "+posting.getJmlKomentar()+" komentar");
    }
}
