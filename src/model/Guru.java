package model;

import java.time.*;
//inheritance/sub-class

    public class Guru extends Karyawan {
        // 3 atribut tambahan untuk Guru
        private String nip;
        private String Jurusan;
        private String bidangKeahlian;

        // constructor
        public Guru() {
            this.nip = nip;
            this.Jurusan = Jurusan;
            this.bidangKeahlian = bidangKeahlian;
        }
        public Guru(String idKaryawan, String nama, LocalDate tanggalLahir, String alamat, String noTelp, String status, int gol, int lamaKerja,
                    String nip, String jurusan, String bidangKeahlian) {
            setIdKaryawan(idKaryawan);
            setNama(nama);
            setTanggalLahir(tanggalLahir);
            setAlamat(alamat);
            setNoTelp(noTelp);
            setStatus(status);
            setGol(gol);
            setLamaKerja(lamaKerja);

            this.nip = nip;
            this.Jurusan = jurusan;
            this. bidangKeahlian = bidangKeahlian;
        }

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
    // getter dan setter
    // method (3)
        public String getNip() {
            return nip;
        }
    // method (4)
        public void setNip(String nip) {
            this.nip = nip;
        }
    // method (5)
        public String getJurusan() {
            return Jurusan;
        }
    // method (6)
        public void setJurusan(String jurusan) {
            Jurusan = jurusan;
        }
    // method (7)
        public String getBidangKeahlian() {
            return bidangKeahlian;
        }
    // method (8)
        public void setBidangKeahlian(String bidangKeahlian) {
            this.bidangKeahlian = bidangKeahlian;
        }

        // cetak data Karyawan, rincian gaji, total gaji
        public void printKaryawan() {
            System.out.println("ID Karyawan      : " + this.getIdKaryawan());
            System.out.println("Nama Karyawan    : " + this.getNama());
            System.out.println("Tgl Lahir        : " + this.getTanggalLahir());
            System.out.println("Alamat           : " + this.getAlamat());
            System.out.println("No Telpon        : " + this.getNoTelp());
            System.out.println("Status           : " + this.getStatus());
            System.out.println("Golongan         : " + this.getGol());
            System.out.println("Lama Kerja       : " + this.getLamaKerja());
            System.out.println("NIP              : " + this.getNip());
            System.out.println("Jurusan          : " + this.getJurusan());
            System.out.println("Bidang Keahlian  : " + this.getBidangKeahlian());
            System.out.println("Usia             : " + this.hitungUsia() + " tahun");
            System.out.println("Gaji Pokok       : Rp " + this.hitungGapok());
            System.out.println("Bonus            : Rp " + this.hitungBonus());
            System.out.println("Tunjangan Karyawan : Rp " + this.hitungTunjangan());
            System.out.println("Tunjangan Guru     : Rp " + this.hitungTunjanganGuru());
            System.out.println("Tunjangan Fungsi   : Rp " + this.hitungTunjanganFungsional());
        }
    }