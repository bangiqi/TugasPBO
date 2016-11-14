# ULANGAN PBO 10 November 2016 
### **Tata cara pengerjaan soal**

> klik link ini [Tata cara pengerjaan soal](https://github.com/ramdanisource/TugasPBO/blob/master/solving%201/README.md) untuk melihat cara pengerjaan tugas

# **Soal**
### **Perhatikan sumber kode dibawah ini!** ###

### **Posting.java**
```
package com.ulangan.javarpl2.model;

/**
 * Created by ramdani on 11/8/16.
 */
public class Posting {

    int userId;
    String userName;
    String status;
    String waktuPost;
    String jmlLike;
    int jmlKomentar;

    public void Posting(String userName,  long jmlKomentar) {
        this.userId = IdUser;
        this.userName = userName;       
        this.jmlLike = _______;
        this.jmlKomentar = jmlkomentar;
    }

    public int getUserId() {
        ______ userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    public int getJmlLike() {
        return ________;
    }

    public void getJmlKomentar() {
        return jmlKomentar;
    }
}

```

### **User.java**
```
package com.ulangan.javarpl1;

import com.ulangan.javarpl1.model.posting;

/**
 * Created by ramdani on 11/8/16.
 */
public class User {

    public static void main (String[] args){

        Posting posting = Posting(
                100012,
                "Fahrezi",
                "semangat ya ulanganya :)",
                "20",
                5
        );

        System.out.println("== BERANDA FASEBOOK ==");
        System.out.println("id user \t\t: "+posting.getIdUser());
        System.out.println("user name \t\t: "+posting.getUserName());
        System.out.println("status \t\t\t: "+posting.getStatus());
        System.out.println("waktu \t\t\t: "+posting.getWaktuPost());
        System.out.println("jumlah like \t: "+posting.getJmlLike()+" likes");
        System.out.println("jumlah komentar : "+posting.getJmlKomentar()+" komentar");
    }
}

```
## **Pertanyaan** 
## 1. Sebutkan pada line berapa saja yang terjadi error syntax, beri solusinya, dan lengkapi bagian yang hilang!
## 2. Ada berapa error pada source code diatas dan output sesuaikan isi seperti output dibawah ini

== BERANDA FASEBOOK ==

id user 		: 100012

user name 		: Fahrezi

status 			: semangat ya ulanganya :)

waktu 			: 1 menit yang lalu

jumlah like 	: 20 likes

jumlah komentar : 5 komentar


# **Pertanyaan yang sering diajukan (FAQ)** 
## **Tanggal berapa deadline tugas dikumpulkan?**

> Tanggal `10 November 2016 ` , sampai jam pelajaran berakhir

## **Bagaimana cara pengumpulan tugasnya?**
> Tugas dikumpulkan melalui gist di github , lalu copy link gist tersebut kemudian input data siswa beserta link gist yang sudah dibuat kemudian input pada form yang sudh disediakan disini [https://goo.gl/forms/Koafv8oNTDAOfCee2](https://goo.gl/forms/Koafv8oNTDAOfCee2)