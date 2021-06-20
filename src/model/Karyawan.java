package model;

import java.time.*;

    public class Karyawan {
        // 8 atribut
        String idKaryawan;
        String nama;
        LocalDate tanggalLahir;
        String Alamat;
        String NoTelp;
        String Status;
        int gol;
        int LamaKerja;
        String User;
        String Password;

        // constructor (1)
        public Karyawan(String idKaryawan, String nama, LocalDate tanggalLahir, String alamat, String noTelp, String status, int gol, int lamaKerja) {
            this.idKaryawan = idKaryawan;
            this.nama = nama;
            this.tanggalLahir = tanggalLahir;
            this.Alamat = alamat;
            this.NoTelp = noTelp;
            this.Status = status;
            this.gol = gol;
            this.LamaKerja = lamaKerja;
        }

        // constructor (2)
        public Karyawan() {
            System.out.println("      Data Gaji Karyawan       ");
            System.out.println("*******************************");
        }

        // constructor (3)
        public Karyawan(String User, String Password)
        {
            this.User = User;
            this.Password = Password;
            System.out.println("*******************************");
            System.out.println("Username: "+this.User);
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
            bonus = 500000;
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
    }
}