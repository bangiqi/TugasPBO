# ULANGAN PBO 9 November 2016 
### **Tata cara pengerjaan soal**

> klik link ini [Tata cara pengerjaan soal](https://github.com/ramdanisource/TugasPBO/blob/master/solving%201/README.md) untuk melihat cara pengerjaan tugas

# **Soal**
### **Perhatikan sumber kode dibawah ini!** ###

### **SmartPhone.java**
```
package com.ulangan.javarpl2.model;

/**
 * Created by ramdani on 11/8/16.
 */
public class SmartPhone {
    
    int nomorIMEI;
    String merek;
    String type;
    int ram;
    String rom;
    String os;

    public SmartPhone(int nomorIMEI, String merek, String type, int ram, int rom) {
        this.nomorIMEI = nomorIMEI;
        this.brand = merek;
        this.ram = rom;
        rom = rom;
    }

    public int getNomorIMEI() {
        return nomorIMEI;
    }

    public String ______() {
        return merek;
    }

    public String getType() {
        return "type";
    }

    public ____ getRam() {
        return ram;
    }

    public String getOs() {
        return rom;
    }
}

```

### **Customer.java**
```
package com.ulangan.javarpl2;

/**
 * Created by ramdani on 11/8/16.
 */
public class Customer {

    public static void main(String[] args){

        SmartPhone smartPhone = New SmartPhone(
                131111100,
                "Xiaomi",
                "Redmi 2",
                "2",
                16,
                "MIUI 8 ( Android Lollipop )"
        );

        System.out.println("== DETAIL SMARTPHONE ==");
        System.out.println("No IMEI\t: "+SmartPhone.getNomorIMEI());
        System.out.println("Merek\t: "+smartPhone.getMerek());
        System.out.println("Type\t: "+smartPhone.getType();
        System.out.println("RAM\t\t: "+smartPhone.getRam()+" GB"));
        System.out.println("ROM\t\t: "+smartPhone.getRam()+" GB");
        System.out.println("OS\t\t: "+smartPhone.getOs());
    }
}

```
## **Pertanyaan** 
1. Sebutkan pada line berapa saja yang terjadi error syntax, beri solusinya, dan lengkapi bagian yang hilang!
2. Ada berapa error pada source code diatas dan tuliskan outputnya?

# **Pertanyaan yang sering diajukan (FAQ)** 
## **Tanggal berapa deadline tugas dikumpulkan?**

> Tanggal `9 November 2016 ` , sampai jam pelajaran berakhir

## **Bagaimana cara pengumpulan tugasnya?**
> Tugas dikumpulkan melalui gist di github , lalu copy link gist tersebut kemudian input data siswa beserta link gist yang sudah dibuat kemudian input pada form yang sudh disediakan disini [https://goo.gl/forms/Koafv8oNTDAOfCee2](https://goo.gl/forms/Koafv8oNTDAOfCee2)