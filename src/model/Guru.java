package model;

import java.time.*;
//inheritance/sub-class

    public class Guru extends Karyawan {
        // 3 atribut tambahan untuk Guru
        String nip;
        String Jurusan;
        String BidangKeahlian;


        // method menghitung tunjangan pegawai Guru (1)
        long hitungTunjanganGuru(){
            long tunjanganGuru = 1000000;
            return tunjanganGuru;
        }

        // method menghitung tunjangan fungsional Guru (2)
        long hitungTunjanganFungsional(){
            long tunjanganFungsional;
            if (this.hitungUsia() < 40){
                tunjanganFungsional = 1700000;
            } else {
                tunjanganFungsional = 2000000;
            }
            return tunjanganFungsional;
        }

        // cetak data Karyawan, rincian gaji, total gaji
        public void printKaryawan(){
            System.out.println("ID Karyawan      : " + this.idKaryawan);
            System.out.println("Nama Karyawan    : " + this.nama);
            System.out.println("Tgl Lahir        : " + this.tanggalLahir);
            System.out.println("Alamat           : " + this.Alamat);
            System.out.println("No Telpon        : " + this.NoTelp);
            System.out.println("Status           : " + this.Status);
            System.out.println("Golongan         : " + this.gol);
            System.out.println("Lama Kerja       : " + this.LamaKerja);
            System.out.println("NIP              : " + this.nip);
            System.out.println("Jurusan          : " + this.Jurusan);
            System.out.println("Bidang Keahlian  : " + this.BidangKeahlian);
            System.out.println("Usia             : " + this.hitungUsia() + " tahun");
            System.out.println("Gaji Pokok       : Rp " + this.hitungGapok());
            System.out.println("Bonus            : Rp " + this.hitungBonus());
            System.out.println("Tunjangan Karyawan : Rp " + this.hitungTunjangan());
            System.out.println("Tunjangan Guru     : Rp " + this.hitungTunjanganGuru());
            System.out.println("Tunjangan Fungsi   : Rp " + this.hitungTunjanganFungsional());
        }
    }