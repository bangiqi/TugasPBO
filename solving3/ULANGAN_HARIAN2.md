# ULANGAN PBO 9 November 2016 
### **Tata cara pengerjaan soal**

> klik link ini [Tata cara pengerjaan soal](https://github.com/ramdanisource/TugasPBO/blob/master/solving%201/README.md) untuk melihat cara pengerjaan tugas

# **Soal**
### **Perhatikan sumber kode dibawah ini!** ###

### **MataKuliah.java**
```
package com.ulangan.javarpl3.model;

/**
 * Created by ramdani on 11/8/16.
 */
public class MataKuliah {

    long npm;
    String kodeMataKuliah;
    String namaMataKuliah;
    int noRuang;

    public MataKuliah(____ npm, int kredit, String hari, int noRuang) {
        this.npm = npm;
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMatkul;
        this.noRuang = noRuang;
    }

    public void getNpm() {
        return Npm;
    }

    public String getKodeMataKuliah() {
        return kodeMatKul;
    }

    public String getNamaMataKuliah() {
        return _________;
    }

    public int getKredit() {
        System.out.println(kredit);
    }

    public int getNoRuang() {
        return noRuang;
    }
}


```

### **Mahasiswa.java**
```
package com.ulangan.javarpl3;

import com.ulangan.javarpl1.model.MataKuliah;

/**
 * Created by ramdani on 11/8/16.
 */
public class Mahasiswa {

    public static void main(String[] args){

        MataKuliah mataKuliah = new mataKuliah(
                1311051503,
                "Studi Islam IV",
                2,
                "205"
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


```
## **Pertanyaan** 
### 1. Sebutkan pada line berapa saja yang terjadi error syntax, beri solusinya, dan lengkapi bagian yang hilang!
### 2. Ada berapa error pada source code diatas dan output sesuaikan isi seperti output dibawah ini

== KARTU TANDA PESERTA UTS ==

NPM 		: 1311051503

Kode Matkul : FA411

Nama Matkul : Studi Islam IV

Kredit 		: 2 SKS

Hari 		: Senin

Ruang 		: 205



# **Pertanyaan yang sering diajukan (FAQ)** 
## **Tanggal berapa deadline tugas dikumpulkan?**

> Tanggal `9 November 2016 ` , sampai jam pelajaran berakhir

## **Bagaimana cara pengumpulan tugasnya?**
> Tugas dikumpulkan melalui gist di github , lalu copy link gist tersebut kemudian input data siswa beserta link gist yang sudah dibuat kemudian input pada form yang sudh disediakan disini [https://goo.gl/forms/FVHT21vTPeNK5Xik1](https://goo.gl/forms/FVHT21vTPeNK5Xik1)