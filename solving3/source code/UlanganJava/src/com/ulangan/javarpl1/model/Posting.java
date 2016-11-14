package com.ulangan.javarpl1.model;

/**
 * Created by ramdani on 11/8/16.
 */
public class Posting {

    int userId;
    String userName;
    String status;
    String waktuPost;
    int jmlLike;
    int jmlKomentar;

    public Posting(int userId, String userName, String status, String waktuPost, int jmlLike, int jmlKomentar) {
        this.userId = userId;
        this.userName = userName;
        this.status = status;
        this.waktuPost = waktuPost;
        this.jmlLike = jmlLike;
        this.jmlKomentar = jmlKomentar;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    public String getWaktuPost() {
        return waktuPost;
    }

    public int getJmlLike() {
        return jmlLike;
    }

    public int getJmlKomentar() {
        return jmlKomentar;
    }
}
