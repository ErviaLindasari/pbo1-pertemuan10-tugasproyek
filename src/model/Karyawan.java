package model;

import java.time.*;

// parentclas / superclass
    public class Karyawan {
       // atribut
       private String idKaryawan;
       private String nama;
       private LocalDate tanggalLahir;
       private String Alamat;
       private String NoTelp;
       private String Status;
       private int gol;
       private int LamaKerja;
       private String User;
       private int Password;
       String riwayat;
       int bonus;

        // constructor (1)
        public Karyawan(String idKaryawan, String nama, LocalDate tanggalLahir, String alamat, String noTelp, String status, int gol, int lamaKerja, String riwayat, int bonus) {
            this.idKaryawan = idKaryawan;
            this.nama = nama;
            this.tanggalLahir = tanggalLahir;
            this.Alamat = alamat;
            this.NoTelp = noTelp;
            this.Status = status;
            this.gol = gol;
            this.LamaKerja = lamaKerja;
            this.riwayat = riwayat;
            this.bonus = bonus;
        }

    // constructor (1)
        public Karyawan() {
            System.out.println("      Data Gaji Karyawan       ");
            System.out.println("*******************************");
        }

    // constructor (2)
        public Karyawan(String User)
        {
            this.User = User;
            System.out.println("*******************************");
            System.out.println("Username: "+this.User);
            System.out.println("*******************************");
        }

    // construktor (3)
        public Karyawan(int password) {
           this.Password = password;
            System.out.println("Password: "+this.Password);
            System.out.println("*******************************");
        }

    // method menghitung usia Karyawan (1)
        public int hitungUsia() {
    // mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
    // hitung selisih tanggal lahir dan tanggal hari ini
        Period selisih = Period.between(this.tanggalLahir, today);
        return selisih.getYears();
    }

    // method menghitung gaji pokok dari gol dan umur (2)
    public long hitungGapok(){
        long gapok = 0;
        if (this.gol == 1) {
            if (this.hitungUsia() < 60) {
                gapok = 3500000;
            } else {
                gapok = 4500000;
            }
        } else if (this.gol == 2) {
            if (this.hitungUsia() < 40) {
                gapok = 5000000;
            } else {
                gapok = 6000000;
            }
        }
        return gapok;
    }

    // method menghitung bonus dari lama kerja (3)
    public long hitungBonus() {
        long bonus =0;
        if (this.LamaKerja >= 6) {
            bonus = 100000;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    // method menghitung tunjangan dari Status (4)
    public long hitungTunjangan() {
        long tunjangan =0;
        if (this.Status == "Menikah") {
            tunjangan = 50000;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    }

    // getter dan setter
    // method (5)
        public String getIdKaryawan() {
            return idKaryawan;
        }
    // method (6)
        public void setIdKaryawan(String idKaryawan) {
            this.idKaryawan = idKaryawan;
        }
    // method (7)
        public String getNama() {
            return nama;
        }
    // method (8)
        public void setNama(String nama) {
            this.nama = nama;
        }
    // method (9)
        public LocalDate getTanggalLahir() {
            return tanggalLahir;
        }
    // method (10)
        public void setTanggalLahir(LocalDate tanggalLahir) {
            this.tanggalLahir = tanggalLahir;
        }
    // method (11)
        public String getAlamat() {
            return Alamat;
        }
    // method (12)
        public void setAlamat(String alamat) {
            Alamat = alamat;
        }
    // method (13)
        public String getNoTelp() {
            return NoTelp;
        }
    // method (14)
        public void setNoTelp(String noTelp) {
            NoTelp = noTelp;
        }
    // method (15)
        public String getStatus() {
            return Status;
        }
    // method (16)
        public void setStatus(String status) {
            Status = status;
        }
    // method (17)
        public int getGol() {
            return gol;
        }
    // method (18)
        public void setGol(int gol) {
            this.gol = gol;
        }
    // method (19)
        public int getLamaKerja() {
            return LamaKerja;
        }
    // method (20)
        public void setLamaKerja(int lamaKerja) {
            LamaKerja = lamaKerja;
        }
    // method (21)
        public String getUser() {
            return User;
        }
    // method (22)
        public void setUser(String user) {
            User = user;
        }
    // method (23)
        public int getPassword() {
            return Password;
        }
    // method (24)
        public void setPassword(int password) {
            Password = password;
        }
    // method (25)
    public String getRiwayat() {
        return riwayat;
    }
    // method (26)
    public void setRiwayat(String riwayat) {
        this.riwayat = riwayat;
    }
    // method overloading (27)
    public boolean Riwayat(String riwayat) {
        String  Riwayat = "Riwayat Kerja Anda"+this.riwayat;
        System.out.println(Riwayat);
        return false;
    }
    // method overloading (28)
    public boolean Bonus(int bonus) {
        String Bonus = "Tambahan bonus yang Anda terima " + this.hitungBonus();
        System.out.println(Bonus);
        return false;
    }

        // mencetak data Karyawan dan gaji pokok
    public void printKaryawan() {
        System.out.println("ID Karyawan   : " + this.idKaryawan);
        System.out.println("Nama Karyawan : " + this.nama);
        System.out.println("Tgl Lahir     : " + this.tanggalLahir);
        System.out.println("Alamat        : " + this.Alamat );
        System.out.println("No Telpon     : " + this.NoTelp );
        System.out.println("Status        : " + this.Status);
        System.out.println("Golongan      : " + this.gol);
        System.out.println("Lama Kerja    : " + this.LamaKerja);
        System.out.println("Gaji Pokok    : Rp " + this.hitungGapok());
        System.out.println("Bonus         : Rp " + this.hitungBonus());
        System.out.println("Tunjangan     : Rp " + this.hitungTunjangan());
        System.out.println("Riwayat Kerja : " + this.riwayat);
        System.out.println();
    }
}