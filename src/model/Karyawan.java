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
            if (this.hitungUsia() < 40) {
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
    public void printPegawai() {
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